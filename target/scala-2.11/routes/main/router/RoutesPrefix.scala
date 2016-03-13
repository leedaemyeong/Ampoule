
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myeong/workspace/tbob/conf/routes
// @DATE:Sun Mar 13 01:25:06 KST 2016


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
