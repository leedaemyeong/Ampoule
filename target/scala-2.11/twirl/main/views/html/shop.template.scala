
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

class shop extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("tBOB for your beautiful life", "shop")/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""

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
object shop extends shop_Scope0.shop
              /*
                  -- GENERATED --
                  DATE: Sat May 07 06:08:32 KST 2016
                  SOURCE: /home/myeong/workspace/ampoule/app/views/shop.scala.html
                  HASH: 1d1f360772b40fa3acbad8a2dd6800fe019eb5bf
                  MATRIX: 527->1|653->32|681->35|733->79|772->81|804->87|840->94
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7
                  -- GENERATED --
              */
          