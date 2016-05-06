
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object learn_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class learn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("tBOB for your beautiful life", "learn")/*3.47*/ {_display_(Seq[Any](format.raw/*3.49*/("""

    """),format.raw/*5.5*/("""OK!!

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(messages)

  def f:(() => (Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (messages) => apply()(messages)

  def ref: this.type = this

}


}

/**/
object learn extends learn_Scope0.learn
              /*
                  -- GENERATED --
                  DATE: Sat May 07 06:08:32 KST 2016
                  SOURCE: /home/myeong/workspace/ampoule/app/views/learn.scala.html
                  HASH: 0c18901dc56a29424464e86e157ee7fbc6694f47
                  MATRIX: 529->1|655->32|683->35|736->80|775->82|807->88|843->95
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          