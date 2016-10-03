
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

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.css"))),format.raw/*13.103*/("""">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.WebJarAssets.at(webJarAssets.locate("bootstrap-theme.min.css"))),format.raw/*14.109*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.at("stylesheets/main.css")),format.raw/*15.79*/("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""),_display_(/*27.48*/Messages("toggle.navigation")),format.raw/*27.77*/("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*32.52*/routes/*32.58*/.ApplicationController.index),format.raw/*32.86*/("""">Silhouette Seed Template</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*36.39*/routes/*36.45*/.ApplicationController.index),format.raw/*36.73*/("""">"""),_display_(/*36.76*/Messages("home")),format.raw/*36.92*/("""</a></li>
                        <li><a href="https://github.com/mohiva/play-silhouette-seed">GitHub</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*40.26*/user/*40.30*/.map/*40.34*/ { u =>_display_(Seq[Any](format.raw/*40.41*/("""
                            """),format.raw/*41.29*/("""<li><a href=""""),_display_(/*41.43*/routes/*41.49*/.ApplicationController.index),format.raw/*41.77*/("""">"""),_display_(/*41.80*/u/*41.81*/.name),format.raw/*41.86*/("""</a></li>
                            """),_display_(/*42.30*/if(u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID)/*42.124*/ {_display_(Seq[Any](format.raw/*42.126*/("""
                                """),format.raw/*43.33*/("""<li><a href=""""),_display_(/*43.47*/routes/*43.53*/.ChangePasswordController.view),format.raw/*43.83*/("""">"""),_display_(/*43.86*/Messages("change.password")),format.raw/*43.113*/("""</a></li>
                            """)))}),format.raw/*44.30*/("""
                            """),format.raw/*45.29*/("""<li><a href=""""),_display_(/*45.43*/routes/*45.49*/.ApplicationController.signOut),format.raw/*45.79*/("""">"""),_display_(/*45.82*/Messages("sign.out")),format.raw/*45.102*/("""</a></li>
                        """)))}/*46.26*/.getOrElse/*46.36*/ {_display_(Seq[Any](format.raw/*46.38*/("""
                            """),format.raw/*47.29*/("""<li><a href=""""),_display_(/*47.43*/routes/*47.49*/.SignInController.view),format.raw/*47.71*/("""">"""),_display_(/*47.74*/Messages("sign.in")),format.raw/*47.93*/("""</a></li>
                            <li><a href=""""),_display_(/*48.43*/routes/*48.49*/.SignUpController.view),format.raw/*48.71*/("""">"""),_display_(/*48.74*/Messages("sign.up")),format.raw/*48.93*/("""</a></li>
                        """)))}),format.raw/*49.26*/("""
                    """),format.raw/*50.21*/("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*56.18*/request/*56.25*/.flash.get("error").map/*56.48*/ { msg =>_display_(Seq[Any](format.raw/*56.57*/("""
                    """),format.raw/*57.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*59.34*/Messages("error")),format.raw/*59.51*/("""</strong> """),_display_(/*59.62*/msg),format.raw/*59.65*/("""
                    """),format.raw/*60.21*/("""</div>
                """)))}),format.raw/*61.18*/("""
                """),_display_(/*62.18*/request/*62.25*/.flash.get("info").map/*62.47*/ { msg =>_display_(Seq[Any](format.raw/*62.56*/("""
                    """),format.raw/*63.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*65.34*/Messages("info")),format.raw/*65.50*/("""</strong> """),_display_(/*65.61*/msg),format.raw/*65.64*/("""
                    """),format.raw/*66.21*/("""</div>
                """)))}),format.raw/*67.18*/("""
                """),_display_(/*68.18*/request/*68.25*/.flash.get("success").map/*68.50*/ { msg =>_display_(Seq[Any](format.raw/*68.59*/("""
                    """),format.raw/*69.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*71.34*/Messages("success")),format.raw/*71.53*/("""</strong> """),_display_(/*71.64*/msg),format.raw/*71.67*/("""
                    """),format.raw/*72.21*/("""</div>
                """)))}),format.raw/*73.18*/("""
                """),_display_(/*74.18*/content),format.raw/*74.25*/("""
            """),format.raw/*75.13*/("""</div>
        </main>
        <script type="text/javascript" src=""""),_display_(/*77.46*/routes/*77.52*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*77.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*78.46*/routes/*78.52*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))),format.raw/*78.109*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.at("javascripts/zxcvbnShim.js")),format.raw/*80.68*/(""""></script>
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
                  DATE: Tue Oct 04 04:13:57 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/main.scala.html
                  HASH: 300aaca3ab4e34abeaa43a888a77b7d1b749c338
                  MATRIX: 586->1|827->146|855->148|1153->420|1167->426|1219->458|1265->477|1291->482|1594->758|1609->764|1689->822|1757->863|1772->869|1858->933|1926->974|1941->980|1996->1014|2716->1707|2766->1736|3047->1990|3062->1996|3111->2024|3333->2219|3348->2225|3397->2253|3427->2256|3464->2272|3714->2495|3727->2499|3740->2503|3785->2510|3842->2539|3883->2553|3898->2559|3947->2587|3977->2590|3987->2591|4013->2596|4079->2635|4183->2729|4224->2731|4285->2764|4326->2778|4341->2784|4392->2814|4422->2817|4471->2844|4541->2883|4598->2912|4639->2926|4654->2932|4705->2962|4735->2965|4777->2985|4831->3020|4850->3030|4890->3032|4947->3061|4988->3075|5003->3081|5046->3103|5076->3106|5116->3125|5195->3177|5210->3183|5253->3205|5283->3208|5323->3227|5389->3262|5438->3283|5628->3446|5644->3453|5676->3476|5723->3485|5772->3506|5973->3680|6011->3697|6049->3708|6073->3711|6122->3732|6177->3756|6222->3774|6238->3781|6269->3803|6316->3812|6365->3833|6564->4005|6601->4021|6639->4032|6663->4035|6712->4056|6767->4080|6812->4098|6828->4105|6862->4130|6909->4139|6958->4160|7160->4335|7200->4354|7238->4365|7262->4368|7311->4389|7366->4413|7411->4431|7439->4438|7480->4451|7575->4519|7590->4525|7666->4579|7750->4636|7765->4642|7844->4699|7999->4827|8014->4833|8074->4872
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|51->27|51->27|56->32|56->32|56->32|60->36|60->36|60->36|60->36|60->36|64->40|64->40|64->40|64->40|65->41|65->41|65->41|65->41|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|67->43|67->43|67->43|68->44|69->45|69->45|69->45|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|71->47|71->47|71->47|72->48|72->48|72->48|72->48|72->48|73->49|74->50|80->56|80->56|80->56|80->56|81->57|83->59|83->59|83->59|83->59|84->60|85->61|86->62|86->62|86->62|86->62|87->63|89->65|89->65|89->65|89->65|90->66|91->67|92->68|92->68|92->68|92->68|93->69|95->71|95->71|95->71|95->71|96->72|97->73|98->74|98->74|99->75|101->77|101->77|101->77|102->78|102->78|102->78|104->80|104->80|104->80
                  -- GENERATED --
              */
          