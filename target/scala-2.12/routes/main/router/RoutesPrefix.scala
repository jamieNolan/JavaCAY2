
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/play-java-seed/conf/routes
// @DATE:Wed Feb 14 13:34:45 GMT 2018


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
