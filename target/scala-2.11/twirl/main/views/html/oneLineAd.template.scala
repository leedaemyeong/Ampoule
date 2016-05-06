
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object oneLineAd_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class oneLineAd extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /* headerAd Template File */
  def apply/*2.2*/(adver: String, where: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<style>
#oneLineAd """),format.raw/*5.12*/("""{"""),format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""position: relative;
	display: table;
	background-color: #00CC00;
	height: 50px; 
	width: 100%;
	text-align: center;
	color: #FFFFFF;
	font-weight: bold;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""#oneLineAd:hover """),format.raw/*16.18*/("""{"""),format.raw/*16.19*/("""
	"""),format.raw/*17.2*/("""background-color: #008080;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/("""#oneLineAd span """),format.raw/*20.17*/("""{"""),format.raw/*20.18*/("""
	"""),format.raw/*21.2*/("""display: table-cell;  
	vertical-align: middle;	
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""a:link """),format.raw/*25.8*/("""{"""),format.raw/*25.9*/("""
	"""),format.raw/*26.2*/("""text-decoration: none;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/("""a:hover """),format.raw/*29.9*/("""{"""),format.raw/*29.10*/("""
	"""),format.raw/*30.2*/("""text-decoration: none;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

"""),format.raw/*33.1*/("""a:active """),format.raw/*33.10*/("""{"""),format.raw/*33.11*/("""
	"""),format.raw/*34.2*/("""text-decoration: none;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""

"""),format.raw/*37.1*/("""a:visited """),format.raw/*37.11*/("""{"""),format.raw/*37.12*/("""
	"""),format.raw/*38.2*/("""text-decoration: none;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

"""),format.raw/*41.1*/("""</style>

<a href=""""),_display_(/*43.11*/where),format.raw/*43.16*/("""">
<div id="oneLineAd">
<span>"""),_display_(/*45.8*/adver),format.raw/*45.13*/("""</span>
</div>
</a>"""))
      }
    }
  }

  def render(adver:String,where:String): play.twirl.api.HtmlFormat.Appendable = apply(adver,where)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (adver,where) => apply(adver,where)

  def ref: this.type = this

}


}

/* headerAd Template File */
object oneLineAd extends oneLineAd_Scope0.oneLineAd
              /*
                  -- GENERATED --
                  DATE: Sat May 07 06:08:32 KST 2016
                  SOURCE: /home/myeong/workspace/ampoule/app/views/oneLineAd.scala.html
                  HASH: 23552536ae303383fdb1f47d6b96f1096b177058
                  MATRIX: 566->30|691->60|719->62|765->81|793->82|821->84|1001->237|1029->238|1058->240|1103->257|1132->258|1161->260|1215->287|1243->288|1272->290|1316->306|1345->307|1374->309|1450->358|1478->359|1507->361|1541->368|1569->369|1598->371|1648->394|1676->395|1705->397|1740->405|1769->406|1798->408|1848->431|1876->432|1905->434|1942->443|1971->444|2000->446|2050->469|2078->470|2107->472|2145->482|2174->483|2203->485|2253->508|2281->509|2310->511|2357->531|2383->536|2440->567|2466->572
                  LINES: 20->2|25->2|27->4|28->5|28->5|29->6|37->14|37->14|39->16|39->16|39->16|40->17|41->18|41->18|43->20|43->20|43->20|44->21|46->23|46->23|48->25|48->25|48->25|49->26|50->27|50->27|52->29|52->29|52->29|53->30|54->31|54->31|56->33|56->33|56->33|57->34|58->35|58->35|60->37|60->37|60->37|61->38|62->39|62->39|64->41|66->43|66->43|68->45|68->45
                  -- GENERATED --
              */
          