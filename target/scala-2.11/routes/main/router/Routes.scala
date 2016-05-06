
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myeong/workspace/ampoule/conf/routes
// @DATE:Sat May 07 06:08:32 KST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shop""", """controllers.Application.shop"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blog""", """controllers.Application.blog"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """learn""", """controllers.Application.learn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """videos""", """controllers.Application.videos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_shop1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shop")))
  )
  private[this] lazy val controllers_Application_shop1_invoker = createInvoker(
    Application_1.shop,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "shop",
      Nil,
      "GET",
      """""",
      this.prefix + """shop"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_blog2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blog")))
  )
  private[this] lazy val controllers_Application_blog2_invoker = createInvoker(
    Application_1.blog,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "blog",
      Nil,
      "GET",
      """""",
      this.prefix + """blog"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_learn3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("learn")))
  )
  private[this] lazy val controllers_Application_learn3_invoker = createInvoker(
    Application_1.learn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "learn",
      Nil,
      "GET",
      """""",
      this.prefix + """learn"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_videos4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("videos")))
  )
  private[this] lazy val controllers_Application_videos4_invoker = createInvoker(
    Application_1.videos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "videos",
      Nil,
      "GET",
      """""",
      this.prefix + """videos"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:7
    case controllers_Application_shop1_route(params) =>
      call { 
        controllers_Application_shop1_invoker.call(Application_1.shop)
      }
  
    // @LINE:8
    case controllers_Application_blog2_route(params) =>
      call { 
        controllers_Application_blog2_invoker.call(Application_1.blog)
      }
  
    // @LINE:9
    case controllers_Application_learn3_route(params) =>
      call { 
        controllers_Application_learn3_invoker.call(Application_1.learn)
      }
  
    // @LINE:10
    case controllers_Application_videos4_route(params) =>
      call { 
        controllers_Application_videos4_invoker.call(Application_1.videos)
      }
  
    // @LINE:13
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}