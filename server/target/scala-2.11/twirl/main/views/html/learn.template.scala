
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

class learn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Messages,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages, environment: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main_org("tBOB for your beautiful life", "learn")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""

    """),format.raw/*5.5*/("""OK!!

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(messages:Messages,environment:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply()(messages,environment)

  def f:(() => (Messages,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = () => (messages,environment) => apply()(messages,environment)

  def ref: this.type = this

}


}

/**/
object learn extends learn_Scope0.learn
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 04:13:57 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/learn.scala.html
                  HASH: 6c63654fdbcb1f84ae01bbe1e4f5bbf1c4541f60
                  MATRIX: 550->1|711->67|739->70|796->119|835->121|867->127|903->134
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          