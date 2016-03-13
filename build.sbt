name := """tbob"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  //jdbc,
  cache,
  ws,
  specs2 % Test,
	"org.webjars" % "bootstrap" % "3.3.6",
	"mysql" % "mysql-connector-java" % "5.1.34",
	"com.typesafe.play" %% "play-slick" % "1.1.1",
	"com.typesafe.play" %% "play-slick-evolutions" % "1.1.1",
	"com.typesafe.play" %% "anorm" % "2.4.0",
	evolutions
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Compile the project before generating Eclipse files,
// so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)

includeFilter in (Assets, LessKeys.less) := "*.less"
