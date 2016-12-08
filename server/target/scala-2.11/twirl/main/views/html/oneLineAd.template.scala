
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

class oneLineAd extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* headerAd Template File */
  def apply/*2.2*/(adver: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.17*/("""

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

<a href="#">
<div id="oneLineAd">
<span>"""),_display_(/*45.8*/adver),format.raw/*45.13*/("""</span>
</div>
</a>"""))
      }
    }
  }

  def render(adver:String): play.twirl.api.HtmlFormat.Appendable = apply(adver)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (adver) => apply(adver)

  def ref: this.type = this

}


}

/* headerAd Template File */
object oneLineAd extends oneLineAd_Scope0.oneLineAd
              /*
                  -- GENERATED --
                  DATE: Thu Oct 20 06:40:26 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/oneLineAd.scala.html
                  HASH: 516b55b01d0b8ab5d5bd863bf40f188929e2a97a
                  MATRIX: 559->30|669->45|697->47|743->66|771->67|799->69|979->222|1007->223|1036->225|1081->242|1110->243|1139->245|1193->272|1221->273|1250->275|1294->291|1323->292|1352->294|1428->343|1456->344|1485->346|1519->353|1547->354|1576->356|1626->379|1654->380|1683->382|1718->390|1747->391|1776->393|1826->416|1854->417|1883->419|1920->428|1949->429|1978->431|2028->454|2056->455|2085->457|2123->467|2152->468|2181->470|2231->493|2259->494|2288->496|2365->547|2391->552
                  LINES: 20->2|25->2|27->4|28->5|28->5|29->6|37->14|37->14|39->16|39->16|39->16|40->17|41->18|41->18|43->20|43->20|43->20|44->21|46->23|46->23|48->25|48->25|48->25|49->26|50->27|50->27|52->29|52->29|52->29|53->30|54->31|54->31|56->33|56->33|56->33|57->34|58->35|58->35|60->37|60->37|60->37|61->38|62->39|62->39|64->41|68->45|68->45
                  -- GENERATED --
              */
          