
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object videos_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class videos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Messages,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages, environment: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main_org("tBOB for your beautiful life", "videos")/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""

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
object videos extends videos_Scope0.videos
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 04:13:57 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/videos.scala.html
                  HASH: 9905143cf17f7a061bf127501bf4965fd0be1895
                  MATRIX: 552->1|713->67|741->70|799->120|838->122|870->128|906->135
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          