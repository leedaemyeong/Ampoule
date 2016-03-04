
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object write_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class write extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(str: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""main("show me the money!!")"""),format.raw/*3.28*/("""{"""),format.raw/*3.29*/("""
	"""),format.raw/*4.2*/("""str
"""),format.raw/*5.1*/("""}"""),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(str:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(str)(messages)

  def f:((String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (str) => (messages) => apply(str)(messages)

  def ref: this.type = this

}


}

/**/
object write extends write_Scope0.write
              /*
                  -- GENERATED --
                  DATE: Thu Mar 03 22:21:01 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/write.scala.html
                  HASH: 5bafec633164138549c8ca59f0af263b1fc0a857
                  MATRIX: 536->1|673->43|701->45|755->72|783->73|811->75|841->79|868->80
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5
                  -- GENERATED --
              */
          