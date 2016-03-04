
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main2_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang=ko>
	<head>
		<title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
	</head>
	<body>
		"""),_display_(/*9.4*/content),format.raw/*9.11*/("""
	"""),format.raw/*10.2*/("""</body>
</html>
		
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages)

  def f:((String) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages) => apply(title)(content)(messages)

  def ref: this.type = this

}


}

/**/
object main2 extends main2_Scope0.main2
              /*
                  -- GENERATED --
                  DATE: Sat Feb 27 13:39:38 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/main2.scala.html
                  HASH: 9a9ffa00414acf13098c6a71e3ca23b6cd6d51cf
                  MATRIX: 541->1|695->60|723->62|798->111|823->116|877->145|904->152|933->154
                  LINES: 20->1|25->1|27->3|30->6|30->6|33->9|33->9|34->10
                  -- GENERATED --
              */
          