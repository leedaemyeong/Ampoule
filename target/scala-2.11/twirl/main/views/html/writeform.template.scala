
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

class writeform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[UserData],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[UserData])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html._

Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main2("tBOB for your creative DIY!!")/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
	"""),format.raw/*6.2*/("""<!--
	"""),_display_(/*7.3*/helper/*7.9*/.form(action=routes.Test.write)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
	"""),_display_(/*8.3*/helper/*8.9*/.inputText(userForm("username"))),format.raw/*8.41*/("""
	"""),format.raw/*9.2*/("""<input type="submit" value="SEND">
	""")))}),format.raw/*10.3*/("""
	"""),format.raw/*11.2*/("""-->
	
	<!--<p>testtest</p>-->

<form method=POST action="/test/write">
	<input type="text" name="username" size=10 maxlength=128>
	<input type="submit" value="SEND">
</form>

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[UserData],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(messages)

  def f:((Form[UserData]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (messages) => apply(userForm)(messages)

  def ref: this.type = this

}


}

/**/
object writeform extends writeform_Scope0.writeform
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 14:31:23 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/writeform.scala.html
                  HASH: ed1697b3862454a38a0a15c05e452e510ee7b448
                  MATRIX: 552->1|721->56|749->79|776->81|821->118|860->120|888->122|920->129|933->135|972->166|1011->168|1039->171|1052->177|1104->209|1132->211|1199->248|1228->250|1434->426
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|30->7|30->7|30->7|30->7|31->8|31->8|31->8|32->9|33->10|34->11|43->20
                  -- GENERATED --
              */
          