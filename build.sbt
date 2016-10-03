name := """Ampoule"""
version := "1.0.0-SNAPSHOT"
lazy val scalaV = "2.11.8"

lazy val server = (project in file("server")).settings(
	scalaVersion := scalaV,
	scalaJSProjects := Seq(client),
	pipelineStages in Assets := Seq(scalaJSPipeline),
	pipelineStages := Seq(digest, gzip),
	compile in Compile <<= (compile in Compile) dependsOn scalaJSPipeline,
	routesGenerator := InjectedRoutesGenerator,
	routesImport += "utils.route.Binders._",
	resolvers ++= Seq(
		"Atlassian Releases" at "https://maven.atlassian.com/public/",
		"Typesafe Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
		"Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
		"Typesafe repository" at "https://repo.typesafe.com/typesafe/maven-releases/",
		Resolver.jcenterRepo
	),
	libraryDependencies ++= Seq(
		cache,
		ws,
		"org.webjars" %% "webjars-play" % "2.5.0-2",
		"org.webjars" % "bootstrap" % "3.3.6",
		"com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3",
		"mysql" % "mysql-connector-java" % "5.1.34",
		"com.typesafe.play" %% "play-slick" % "2.0.0",
		"com.typesafe.play" %% "play-slick-evolutions" % "2.0.0",
		"com.typesafe.play" %% "anorm" % "2.5.0",
		"org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0" % "test",
		"com.mohiva" %% "play-silhouette" % "4.0.0",
		"com.mohiva" %% "play-silhouette-password-bcrypt" % "4.0.0",
		"com.mohiva" %% "play-silhouette-crypto-jca" % "4.0.0",
		"com.mohiva" %% "play-silhouette-persistence" % "4.0.0",
		"com.mohiva" %% "play-silhouette-testkit" % "4.0.0" % "test",
		"org.webjars" %% "webjars-play" % "2.5.0-2",
		"net.codingwell" %% "scala-guice" % "4.0.1",
		"com.iheart" %% "ficus" % "1.2.6",
		"com.typesafe.play" %% "play-mailer" % "5.0.0",
		"com.enragedginger" %% "akka-quartz-scheduler" % "1.5.0-akka-2.4.x",
		"com.vmunier" %% "scalajs-scripts" % "1.0.0",
		specs2 % Test,
		evolutions,
		filters
	)
).enablePlugins(PlayScala).dependsOn(sharedJvm)

lazy val client = (project in file("client")).settings(
	scalaVersion := scalaV,
	scalaJSUseRhino in Global := false,
	scalaJSStage in Global := FastOptStage,
	jsEnv := NodeJSEnv().value,
	persistLauncher := true,
	persistLauncher in Test := false,
  skip in packageJSDependencies := false,
	jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js",
	jsDependencies += RuntimeDOM,
	libraryDependencies ++= Seq(
		"org.scala-js" %%% "scalajs-dom" % "0.9.0",
		"be.doeraene" %%% "scalajs-jquery" % "0.9.0"
	),
	libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
	testFrameworks += new TestFramework("utest.runner.Framework")
).enablePlugins(ScalaJSPlugin, ScalaJSWeb).dependsOn(sharedJs)

lazy val shared = (crossProject.crossType(CrossType.Pure) in file("shared")).
	settings(scalaVersion := scalaV).
	jsConfigure(_ enablePlugins ScalaJSWeb)

lazy val sharedJvm = shared.jvm
lazy val sharedJs = shared.js

// loads the server project at sbt startup
onLoad in Global := (Command.process("project server", _: State)) compose (onLoad in Global).value

// for Eclipse users
EclipseKeys.skipParents in ThisBuild := false
// Compile the project before generating Eclipse files,
// so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in (server, Compile))

fork in run := false
