
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myeong/workspace/ampoule/conf/routes
// @DATE:Sat May 07 06:08:32 KST 2016


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
