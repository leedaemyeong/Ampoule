
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

class write extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[UserData,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: UserData)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

"""),_display_(/*3.2*/main2("show me the money!!")/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
	"""),_display_(/*4.3*/user/*4.7*/.username),format.raw/*4.16*/("""	
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(user:UserData,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user)(messages)

  def f:((UserData) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user) => (messages) => apply(user)(messages)

  def ref: this.type = this

}


}

/**/
object write extends write_Scope0.write
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 07:24:18 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/write.scala.html
                  HASH: 79da0d47622b62df7c143bde9ee52fe88207cdb6
                  MATRIX: 538->1|678->46|706->49|742->77|780->78|808->81|819->85|848->94|880->97
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4|28->4|29->5
                  -- GENERATED --
              */
          