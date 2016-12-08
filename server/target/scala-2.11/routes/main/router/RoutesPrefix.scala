
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myeong/workspace/Ampoule/server/conf/routes
// @DATE:Thu Oct 20 06:32:13 KST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
