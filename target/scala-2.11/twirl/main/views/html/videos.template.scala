
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

class videos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("tBOB for your beautiful life", "videos")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""

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
object videos extends videos_Scope0.videos
              /*
                  -- GENERATED --
                  DATE: Sat May 07 06:08:32 KST 2016
                  SOURCE: /home/myeong/workspace/ampoule/app/views/videos.scala.html
                  HASH: 7b947447ca25eba1fe4f9e492823877a265f3049
                  MATRIX: 531->1|657->32|685->35|739->81|778->83|810->89|846->96
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          