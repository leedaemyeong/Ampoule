
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,Option[models.User],Html,RequestHeader,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.147*/("""

"""),format.raw/*3.1*/("""<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <link rel="icon" href=""""),_display_(/*10.33*/routes/*10.39*/.Assets.at("images/favicon.png")),format.raw/*10.71*/("""" sizes="32x32">
        <title>"""),_display_(/*11.17*/title),format.raw/*11.22*/("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.css"))),format.raw/*14.103*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.WebJarAssets.at(webJarAssets.locate("bootstrap-theme.min.css"))),format.raw/*15.109*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("stylesheets/main.css")),format.raw/*16.79*/("""">
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="container">
            <ul class="nav navbar-nav navbar-right very-top-nav">
                """),_display_(/*26.18*/user/*26.22*/.map/*26.26*/ { u =>_display_(Seq[Any](format.raw/*26.33*/("""
                """),format.raw/*27.17*/("""<li><a href=""""),_display_(/*27.31*/routes/*27.37*/.ApplicationController.index),format.raw/*27.65*/("""">"""),_display_(/*27.68*/u/*27.69*/.name),format.raw/*27.74*/("""</a></li>
                """),_display_(/*28.18*/if(u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID)/*28.112*/ {_display_(Seq[Any](format.raw/*28.114*/("""
                """),format.raw/*29.17*/("""<li><a href=""""),_display_(/*29.31*/routes/*29.37*/.ChangePasswordController.view),format.raw/*29.67*/("""">"""),_display_(/*29.70*/Messages("change.password")),format.raw/*29.97*/("""</a></li>
                """)))}),format.raw/*30.18*/("""
                """),format.raw/*31.17*/("""<li><a href=""""),_display_(/*31.31*/routes/*31.37*/.ApplicationController.signOut),format.raw/*31.67*/("""">"""),_display_(/*31.70*/Messages("sign.out")),format.raw/*31.90*/("""</a></li>
                """)))}/*32.18*/.getOrElse/*32.28*/ {_display_(Seq[Any](format.raw/*32.30*/("""
                """),format.raw/*33.17*/("""<li><a href=""""),_display_(/*33.31*/routes/*33.37*/.SignInController.view),format.raw/*33.59*/("""">"""),_display_(/*33.62*/Messages("sign.in")),format.raw/*33.81*/("""</a></li>
                <li><a href=""""),_display_(/*34.31*/routes/*34.37*/.SignUpController.view),format.raw/*34.59*/("""">"""),_display_(/*34.62*/Messages("sign.up")),format.raw/*34.81*/("""</a></li>
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</ul>
        </div>
        <div class="masthead">
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.ApplicationController.index),format.raw/*39.57*/(""""><img src='"""),_display_(/*39.70*/routes/*39.76*/.Assets.at("images/ampoule.png")),format.raw/*39.108*/("""'></a>
        </div>
        <header class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""),_display_(/*45.48*/Messages("toggle.navigation")),format.raw/*45.77*/("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                <!--<a class="navbar-brand" href=""""),_display_(/*50.52*/routes/*50.58*/.ApplicationController.index),format.raw/*50.86*/("""">"""),_display_(/*50.89*/Messages("project.name")),format.raw/*50.113*/("""</a>-->
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*54.39*/routes/*54.45*/.ApplicationController.index),format.raw/*54.73*/("""">"""),_display_(/*54.76*/Messages("accessory")),format.raw/*54.97*/("""</a></li>
                        <li><a href=""""),_display_(/*55.39*/routes/*55.45*/.ApplicationController.index),format.raw/*55.73*/("""">"""),_display_(/*55.76*/Messages("stationary")),format.raw/*55.98*/("""</a></li>
                        <li><a href=""""),_display_(/*56.39*/routes/*56.45*/.ApplicationController.index),format.raw/*56.73*/("""">"""),_display_(/*56.76*/Messages("flower")),format.raw/*56.94*/("""</a></li>
                        <li><a href=""""),_display_(/*57.39*/routes/*57.45*/.ApplicationController.index),format.raw/*57.73*/("""">"""),_display_(/*57.76*/Messages("styling")),format.raw/*57.95*/("""</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            """),_display_(/*61.30*/Messages("for.more.convenience")),format.raw/*61.62*/("""
                            """),format.raw/*62.29*/("""<span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
                            <li><a href="#">장바구니 담아놓고 나중에 구입가능</a></li>
                            <li><a href="#">주로찾는카테고리로이동</a></li>
                            <li><a href="#"> 내글만 보고 싶음</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#"> 이 모든것은 로그인을 해야~~</a></li>
                        </ul>
                    </ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*77.18*/request/*77.25*/.flash.get("error").map/*77.48*/ { msg =>_display_(Seq[Any](format.raw/*77.57*/("""
                    """),format.raw/*78.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*80.34*/Messages("error")),format.raw/*80.51*/("""</strong> """),_display_(/*80.62*/msg),format.raw/*80.65*/("""
                    """),format.raw/*81.21*/("""</div>
                """)))}),format.raw/*82.18*/("""
                """),_display_(/*83.18*/request/*83.25*/.flash.get("info").map/*83.47*/ { msg =>_display_(Seq[Any](format.raw/*83.56*/("""
                    """),format.raw/*84.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*86.34*/Messages("info")),format.raw/*86.50*/("""</strong> """),_display_(/*86.61*/msg),format.raw/*86.64*/("""
                    """),format.raw/*87.21*/("""</div>
                """)))}),format.raw/*88.18*/("""
                """),_display_(/*89.18*/request/*89.25*/.flash.get("success").map/*89.50*/ { msg =>_display_(Seq[Any](format.raw/*89.59*/("""
                    """),format.raw/*90.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*92.34*/Messages("success")),format.raw/*92.53*/("""</strong> """),_display_(/*92.64*/msg),format.raw/*92.67*/("""
                    """),format.raw/*93.21*/("""</div>
                """)))}),format.raw/*94.18*/("""
                """),_display_(/*95.18*/content),format.raw/*95.25*/("""
            """),format.raw/*96.13*/("""</div>
        </main>
        <!-- Site footer -->
        <footer class="footer">
            <p>&copy; 2016 Company, Inc.</p>
        </footer>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <script type="text/javascript" src=""""),_display_(/*103.46*/routes/*103.52*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*103.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*104.46*/routes/*104.52*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))),format.raw/*104.109*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*106.23*/routes/*106.29*/.Assets.at("javascripts/zxcvbnShim.js")),format.raw/*106.68*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:Option[models.User],content:Html,request:RequestHeader,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,webJarAssets)

  def f:((String,Option[models.User]) => (Html) => (RequestHeader,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,webJarAssets) => apply(title,user)(content)(request,messages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jan 19 06:08:57 KST 2017
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/main.scala.html
                  HASH: 7c6c1178734b6dcc80c93f1ff242f36447ca8eef
                  MATRIX: 586->1|827->146|855->148|1153->420|1167->426|1219->458|1281->493|1296->499|1349->531|1409->564|1435->569|1738->845|1753->851|1833->909|1901->950|1916->956|2002->1020|2070->1061|2085->1067|2140->1101|2627->1561|2640->1565|2653->1569|2698->1576|2743->1593|2784->1607|2799->1613|2848->1641|2878->1644|2888->1645|2914->1650|2968->1677|3072->1771|3113->1773|3158->1790|3199->1804|3214->1810|3265->1840|3295->1843|3343->1870|3401->1897|3446->1914|3487->1928|3502->1934|3553->1964|3583->1967|3624->1987|3670->2014|3689->2024|3729->2026|3774->2043|3815->2057|3830->2063|3873->2085|3903->2088|3943->2107|4010->2147|4025->2153|4068->2175|4098->2178|4138->2197|4196->2224|4237->2237|4338->2311|4353->2317|4402->2345|4442->2358|4457->2364|4511->2396|4871->2729|4921->2758|5202->3012|5217->3018|5266->3046|5296->3049|5342->3073|5541->3245|5556->3251|5605->3279|5635->3282|5677->3303|5752->3351|5767->3357|5816->3385|5846->3388|5889->3410|5964->3458|5979->3464|6028->3492|6058->3495|6097->3513|6172->3561|6187->3567|6236->3595|6266->3598|6306->3617|6630->3914|6683->3946|6740->3975|7468->4676|7484->4683|7516->4706|7563->4715|7612->4736|7813->4910|7851->4927|7889->4938|7913->4941|7962->4962|8017->4986|8062->5004|8078->5011|8109->5033|8156->5042|8205->5063|8404->5235|8441->5251|8479->5262|8503->5265|8552->5286|8607->5310|8652->5328|8668->5335|8702->5360|8749->5369|8798->5390|9000->5565|9040->5584|9078->5595|9102->5598|9151->5619|9206->5643|9251->5661|9279->5668|9320->5681|9661->5994|9677->6000|9754->6054|9839->6111|9855->6117|9935->6174|10091->6302|10107->6308|10168->6347
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|50->26|50->26|50->26|50->26|51->27|51->27|51->27|51->27|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|53->29|53->29|53->29|54->30|55->31|55->31|55->31|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|57->33|57->33|57->33|58->34|58->34|58->34|58->34|58->34|59->35|60->36|63->39|63->39|63->39|63->39|63->39|63->39|69->45|69->45|74->50|74->50|74->50|74->50|74->50|78->54|78->54|78->54|78->54|78->54|79->55|79->55|79->55|79->55|79->55|80->56|80->56|80->56|80->56|80->56|81->57|81->57|81->57|81->57|81->57|85->61|85->61|86->62|101->77|101->77|101->77|101->77|102->78|104->80|104->80|104->80|104->80|105->81|106->82|107->83|107->83|107->83|107->83|108->84|110->86|110->86|110->86|110->86|111->87|112->88|113->89|113->89|113->89|113->89|114->90|116->92|116->92|116->92|116->92|117->93|118->94|119->95|119->95|120->96|127->103|127->103|127->103|128->104|128->104|128->104|130->106|130->106|130->106
                  -- GENERATED --
              */
          