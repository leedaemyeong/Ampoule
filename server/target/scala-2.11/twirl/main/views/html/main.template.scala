
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
        <header class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""),_display_(/*28.48*/Messages("toggle.navigation")),format.raw/*28.77*/("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*33.52*/routes/*33.58*/.ApplicationController.index),format.raw/*33.86*/("""">"""),_display_(/*33.89*/Messages("project.name")),format.raw/*33.113*/("""</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*37.39*/routes/*37.45*/.ApplicationController.index),format.raw/*37.73*/("""">"""),_display_(/*37.76*/Messages("accessory")),format.raw/*37.97*/("""</a></li>
                        <li><a href=""""),_display_(/*38.39*/routes/*38.45*/.ApplicationController.index),format.raw/*38.73*/("""">"""),_display_(/*38.76*/Messages("stationary")),format.raw/*38.98*/("""</a></li>
                        <li><a href=""""),_display_(/*39.39*/routes/*39.45*/.ApplicationController.index),format.raw/*39.73*/("""">"""),_display_(/*39.76*/Messages("flower")),format.raw/*39.94*/("""</a></li>
                        <li><a href=""""),_display_(/*40.39*/routes/*40.45*/.ApplicationController.index),format.raw/*40.73*/("""">"""),_display_(/*40.76*/Messages("styling")),format.raw/*40.95*/("""</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*43.26*/user/*43.30*/.map/*43.34*/ { u =>_display_(Seq[Any](format.raw/*43.41*/("""
                            """),format.raw/*44.29*/("""<li><a href=""""),_display_(/*44.43*/routes/*44.49*/.ApplicationController.index),format.raw/*44.77*/("""">"""),_display_(/*44.80*/u/*44.81*/.name),format.raw/*44.86*/("""</a></li>
                            """),_display_(/*45.30*/if(u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID)/*45.124*/ {_display_(Seq[Any](format.raw/*45.126*/("""
                                """),format.raw/*46.33*/("""<li><a href=""""),_display_(/*46.47*/routes/*46.53*/.ChangePasswordController.view),format.raw/*46.83*/("""">"""),_display_(/*46.86*/Messages("change.password")),format.raw/*46.113*/("""</a></li>
                            """)))}),format.raw/*47.30*/("""
                            """),format.raw/*48.29*/("""<li><a href=""""),_display_(/*48.43*/routes/*48.49*/.ApplicationController.signOut),format.raw/*48.79*/("""">"""),_display_(/*48.82*/Messages("sign.out")),format.raw/*48.102*/("""</a></li>
                        """)))}/*49.26*/.getOrElse/*49.36*/ {_display_(Seq[Any](format.raw/*49.38*/("""
                            """),format.raw/*50.29*/("""<li><a href=""""),_display_(/*50.43*/routes/*50.49*/.SignInController.view),format.raw/*50.71*/("""">"""),_display_(/*50.74*/Messages("sign.in")),format.raw/*50.93*/("""</a></li>
                            <li><a href=""""),_display_(/*51.43*/routes/*51.49*/.SignUpController.view),format.raw/*51.71*/("""">"""),_display_(/*51.74*/Messages("sign.up")),format.raw/*51.93*/("""</a></li>
                        """)))}),format.raw/*52.26*/("""
                        """),format.raw/*53.25*/("""<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            """),_display_(/*54.30*/Messages("for.more.convenience")),format.raw/*54.62*/("""
                            """),format.raw/*55.29*/("""<span class="caret"></span>
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
                """),_display_(/*70.18*/request/*70.25*/.flash.get("error").map/*70.48*/ { msg =>_display_(Seq[Any](format.raw/*70.57*/("""
                    """),format.raw/*71.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*73.34*/Messages("error")),format.raw/*73.51*/("""</strong> """),_display_(/*73.62*/msg),format.raw/*73.65*/("""
                    """),format.raw/*74.21*/("""</div>
                """)))}),format.raw/*75.18*/("""
                """),_display_(/*76.18*/request/*76.25*/.flash.get("info").map/*76.47*/ { msg =>_display_(Seq[Any](format.raw/*76.56*/("""
                    """),format.raw/*77.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*79.34*/Messages("info")),format.raw/*79.50*/("""</strong> """),_display_(/*79.61*/msg),format.raw/*79.64*/("""
                    """),format.raw/*80.21*/("""</div>
                """)))}),format.raw/*81.18*/("""
                """),_display_(/*82.18*/request/*82.25*/.flash.get("success").map/*82.50*/ { msg =>_display_(Seq[Any](format.raw/*82.59*/("""
                    """),format.raw/*83.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*85.34*/Messages("success")),format.raw/*85.53*/("""</strong> """),_display_(/*85.64*/msg),format.raw/*85.67*/("""
                    """),format.raw/*86.21*/("""</div>
                """)))}),format.raw/*87.18*/("""
                """),_display_(/*88.18*/content),format.raw/*88.25*/("""
            """),format.raw/*89.13*/("""</div>
        </main>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <script type="text/javascript" src=""""),_display_(/*92.46*/routes/*92.52*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*92.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*93.46*/routes/*93.52*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))),format.raw/*93.109*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*95.23*/routes/*95.29*/.Assets.at("javascripts/zxcvbnShim.js")),format.raw/*95.68*/(""""></script>
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
                  DATE: Tue Nov 22 07:53:48 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/main.scala.html
                  HASH: e883008af24a34ce1d9c2d66e9e10ae8178fa146
                  MATRIX: 586->1|827->146|855->148|1153->420|1167->426|1219->458|1281->493|1296->499|1349->531|1409->564|1435->569|1738->845|1753->851|1833->909|1901->950|1916->956|2002->1020|2070->1061|2085->1067|2140->1101|2823->1757|2873->1786|3154->2040|3169->2046|3218->2074|3248->2077|3294->2101|3490->2270|3505->2276|3554->2304|3584->2307|3626->2328|3701->2376|3716->2382|3765->2410|3795->2413|3838->2435|3913->2483|3928->2489|3977->2517|4007->2520|4046->2538|4121->2586|4136->2592|4185->2620|4215->2623|4255->2642|4404->2764|4417->2768|4430->2772|4475->2779|4532->2808|4573->2822|4588->2828|4637->2856|4667->2859|4677->2860|4703->2865|4769->2904|4873->2998|4914->3000|4975->3033|5016->3047|5031->3053|5082->3083|5112->3086|5161->3113|5231->3152|5288->3181|5329->3195|5344->3201|5395->3231|5425->3234|5467->3254|5521->3289|5540->3299|5580->3301|5637->3330|5678->3344|5693->3350|5736->3372|5766->3375|5806->3394|5885->3446|5900->3452|5943->3474|5973->3477|6013->3496|6079->3531|6132->3556|6335->3732|6388->3764|6445->3793|7173->4494|7189->4501|7221->4524|7268->4533|7317->4554|7518->4728|7556->4745|7594->4756|7618->4759|7667->4780|7722->4804|7767->4822|7783->4829|7814->4851|7861->4860|7910->4881|8109->5053|8146->5069|8184->5080|8208->5083|8257->5104|8312->5128|8357->5146|8373->5153|8407->5178|8454->5187|8503->5208|8705->5383|8745->5402|8783->5413|8807->5416|8856->5437|8911->5461|8956->5479|8984->5486|9025->5499|9241->5688|9256->5694|9332->5748|9416->5805|9431->5811|9510->5868|9665->5996|9680->6002|9740->6041
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|52->28|52->28|57->33|57->33|57->33|57->33|57->33|61->37|61->37|61->37|61->37|61->37|62->38|62->38|62->38|62->38|62->38|63->39|63->39|63->39|63->39|63->39|64->40|64->40|64->40|64->40|64->40|67->43|67->43|67->43|67->43|68->44|68->44|68->44|68->44|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|70->46|70->46|70->46|71->47|72->48|72->48|72->48|72->48|72->48|72->48|73->49|73->49|73->49|74->50|74->50|74->50|74->50|74->50|74->50|75->51|75->51|75->51|75->51|75->51|76->52|77->53|78->54|78->54|79->55|94->70|94->70|94->70|94->70|95->71|97->73|97->73|97->73|97->73|98->74|99->75|100->76|100->76|100->76|100->76|101->77|103->79|103->79|103->79|103->79|104->80|105->81|106->82|106->82|106->82|106->82|107->83|109->85|109->85|109->85|109->85|110->86|111->87|112->88|112->88|113->89|116->92|116->92|116->92|117->93|117->93|117->93|119->95|119->95|119->95
                  -- GENERATED --
              */
          