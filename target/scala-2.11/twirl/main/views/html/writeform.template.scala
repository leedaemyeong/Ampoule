
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object writeform_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class writeform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main2("tBOB for your creative DIY!!")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

"""),format.raw/*5.1*/("""<form method=POST action="test/write">
	<input type="text" name="username" size=10 maxlength=128>
	<input type="submit" value="SEND">
</form>

""")))}),format.raw/*10.2*/("""
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
object writeform extends writeform_Scope0.writeform
              /*
                  -- GENERATED --
                  DATE: Thu Mar 03 22:03:44 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/writeform.scala.html
                  HASH: dfa1180f6010e57a526bf14e750aa3c9bbdac922
                  MATRIX: 537->1|663->32|691->35|736->72|775->74|803->76|977->220
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|34->10
                  -- GENERATED --
              */
          