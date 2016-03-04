
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*8.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.70*/("""" type="text/javascript"></script>
    </head>
    <body>
	    <div class="screenshot" style="border: 1px">
	    	<div class="navbar navbar-inverse navbar-fixed-top" style="border: 10px solid">
	    		<div class="navbar-header">
	    			<a class="navbar-brand" href=""""),_display_(/*17.40*/routes/*17.46*/.Application.index()),format.raw/*17.66*/("""">TEST</a>
	    		</div>
	   		</div>
	    	<div class="container" style="color: #000; border: 10px solid; border-color: #000;">
	    		<br><br><br><br><br>
	    		"""),_display_(/*22.9*/content),format.raw/*22.16*/("""
	    		"""),format.raw/*23.8*/("""<br>
				"""),_display_(/*24.6*/Messages("test")),format.raw/*24.22*/("""
       	"""),format.raw/*25.9*/("""</div>
       </div>
    </body>
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
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Feb 12 08:05:57 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/main.scala.html
                  HASH: b693a53afd16b297cdfab6e94d778dcecf0d17c8
                  MATRIX: 539->1|693->60|721->62|798->113|823->118|911->180|925->186|998->238|1080->294|1094->300|1156->341|1244->402|1259->408|1320->447|1372->472|1387->478|1449->519|1744->787|1759->793|1800->813|1991->978|2019->985|2054->993|2090->1003|2127->1019|2163->1028
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|41->17|41->17|41->17|46->22|46->22|47->23|48->24|48->24|49->25
                  -- GENERATED --
              */
          