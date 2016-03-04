
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
	"""),_display_(/*6.3*/helper/*6.9*/.form(action=routes.Test.write)/*6.40*/ {_display_(Seq[Any](format.raw/*6.42*/("""
	"""),_display_(/*7.3*/helper/*7.9*/.inputText(userForm("username"))),format.raw/*7.41*/("""
	"""),format.raw/*8.2*/("""<input type="submit" value="SEND">
	""")))}),format.raw/*9.3*/("""

"""),format.raw/*11.1*/("""<!--
<form method=POST action=""""),_display_(/*12.28*/routes/*12.34*/.Test.write),format.raw/*12.45*/("""">
	<input type="text" name="username" size=10 maxlength=128>
	<input type="submit" value="SEND">
</form>
-->

""")))}),format.raw/*18.2*/("""
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
                  DATE: Sat Mar 05 07:51:10 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/writeform.scala.html
                  HASH: 5804ec3a482377720e6b87e6baabf8f5417f52d4
                  MATRIX: 552->1|721->56|749->79|776->81|821->118|860->120|888->123|901->129|940->160|979->162|1007->165|1020->171|1072->203|1100->205|1166->242|1195->244|1254->276|1269->282|1301->293|1443->405
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|30->7|30->7|30->7|31->8|32->9|34->11|35->12|35->12|35->12|41->18
                  -- GENERATED --
              */
          