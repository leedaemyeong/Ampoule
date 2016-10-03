
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myeong/workspace/Ampoule/server/conf/routes
// @DATE:Sun Oct 02 06:58:00 KST 2016


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
