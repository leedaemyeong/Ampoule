
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object shop_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class shop extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Messages,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages, environment: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/main_org("tBOB for your beautiful life", "shop")/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""

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
object shop extends shop_Scope0.shop
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 04:13:57 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/shop.scala.html
                  HASH: 24c3b5b87009fffde3b761afe275db82f0153c8e
                  MATRIX: 548->1|709->67|737->70|793->118|832->120|864->126|900->133
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          