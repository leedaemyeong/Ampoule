
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_org_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main_org extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,Html,Messages,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, from: String)(content: Html)(implicit messages: Messages, environment: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.110*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta name="author" content="Lee Daemyeong">
        <meta name="email" content="leedaemyeong@gmail.com">
        <meta name="description" content="">
        
        <title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.at("images/favicon.png")),format.raw/*16.97*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*18.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.at("stylesheets/main.css")),format.raw/*19.94*/("""">
        
        
    </head>
    <body>
    	"""),_display_(/*24.7*/if(from == "index")/*24.26*/ {_display_(Seq[Any](format.raw/*24.28*/(""" """),_display_(/*24.30*/oneLineAd(Messages("main.oneLineAd"), routes.Application.index.toString)),format.raw/*24.102*/(""" """)))}),format.raw/*24.104*/("""
	    """),format.raw/*25.6*/("""<nav class="navbar navbar-default" style="margin-bottom: 10px;">
           <div class="container-fluid">
			    <div class="navbar-header">
				    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				    <span class="sr-only">Toggle navigation</span>
				    <span class="icon-bar"></span>
				    <span class="icon-bar"></span>
				    <span class="icon-bar"></span>
				    </button>
				    <!-- The mobile navbar-toggle button can be safely removed since you do not need it in a non-responsive implementation -->
				    <a class="navbar-brand" href=""""),_display_(/*35.40*/routes/*35.46*/.Application.index),format.raw/*35.64*/("""">"""),_display_(/*35.67*/Messages("project.name")),format.raw/*35.91*/("""</a>
			    </div>
			    <!-- Note that the .navbar-collapse and .collapse classes have been removed from the #navbar -->
			    <div id="navbar" class="navbar-collapse collapse">
			    	<ul class="nav navbar-nav">
			    		<li """),_display_(/*40.15*/if(from=="shop")/*40.31*/ {_display_(Seq[Any](format.raw/*40.33*/("""class="active"""")))}),format.raw/*40.48*/("""><a href=""""),_display_(/*40.59*/routes/*40.65*/.Application.shop),format.raw/*40.82*/("""">"""),_display_(/*40.85*/Messages("main.topnav.shop")),format.raw/*40.113*/("""</a></li>
			    		<li """),_display_(/*41.15*/if(from=="blog")/*41.31*/ {_display_(Seq[Any](format.raw/*41.33*/("""class="active"""")))}),format.raw/*41.48*/("""><a href=""""),_display_(/*41.59*/routes/*41.65*/.Application.blog),format.raw/*41.82*/("""">"""),_display_(/*41.85*/Messages("main.topnav.blog")),format.raw/*41.113*/("""</a></li>
			    		<li """),_display_(/*42.15*/if(from=="learn")/*42.32*/ {_display_(Seq[Any](format.raw/*42.34*/("""class="active"""")))}),format.raw/*42.49*/("""><a href=""""),_display_(/*42.60*/routes/*42.66*/.Application.learn),format.raw/*42.84*/("""">"""),_display_(/*42.87*/Messages("main.topnav.learn")),format.raw/*42.116*/("""</a></li>
			    		<li """),_display_(/*43.15*/if(from=="videos")/*43.33*/ {_display_(Seq[Any](format.raw/*43.35*/("""class="active"""")))}),format.raw/*43.50*/("""><a href=""""),_display_(/*43.61*/routes/*43.67*/.Application.videos),format.raw/*43.86*/("""">"""),_display_(/*43.89*/Messages("main.topnav.videos")),format.raw/*43.119*/("""</a></li> 		
		    		</ul>
		    		<form class="navbar-form navbar-left" role="search">
			    		<div class="input-group">
		              	<input type="text" class="form-control" placeholder="Search for...">
		              	<span class="input-group-btn">
		              		<button type="submit" class="btn btn-default">Submit</button>
	              		</span>
		              </div>
	              </form>
	              <ul class="nav navbar-nav navbar-right">
	              	<li><a href="#">이대명 님, 반갑습니다.</a></li>
	              	<li><a href="#">"""),_display_(/*55.34*/Messages("main.signout")),format.raw/*55.58*/("""</a></li>
	              	<li><a href="#">"""),_display_(/*56.34*/Messages("main.wishlists")),format.raw/*56.60*/("""</a></li>
	              	<li><a href="#">"""),_display_(/*57.34*/Messages("main.cart")),format.raw/*57.55*/(""" """),format.raw/*57.56*/("""<span class="badge">42</span></a></li>
	              	<li class="dropdown">
			    			<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">"""),_display_(/*59.128*/Messages("main.account")),format.raw/*59.152*/(""" """),format.raw/*59.153*/("""<span class="caret"></span></a>
		    				<ul class="dropdown-menu">
		    					<li><a href="#">Action</a></li>
		    					<li><a href="#">Another action</a></li>
		    					<li><a href="#">Something else here</a></li>
		    					<li role="separator" class="divider"></li>
		    					<li class="dropdown-header">Nav header</li>
		    					<li><a href="#">Separated link</a></li>
		    					<li><a href="#">One more separated link</a></li>
		    				</ul>
		    			</li>
	             	</ul>
	          	</div><!--/.nav-collapse -->
	      	</div>
	   	</nav>
	   	
	   	"""),_display_(/*75.7*/content),format.raw/*75.14*/("""
	   	
	   	"""),format.raw/*77.6*/("""<div class="container-fluid" style="background-color: #e5e5e5; padding: 20px 20px 0px 20px;">
	   		<div class="col-md-6">
		   		<ul class="list-unstyled">
		   			<li> </li>
	            	<li><a href="#">CONTACT</a></li>
	            	<li><a href="#">FAQ</a></li>
	            	<li><a href="#">SHIPPING & RETURNS</a></li>
	            	<li><a href="#">PRIVACY & LEGAL</a></li>
	            	<li><a href="#">ABOUT US</a></li>
	          	</ul>
	   		</div>
	   		<div class="col-md-6">
	   		<h2 class="text-right">"We are the music makers, And we are the dreamers of dreams"</h1>
	   		<h2 class="text-right">- Arthur O'Shaughnessy</h1>
	   		</div>
		   	<!-- FOOTER -->
		   	<footer class="col-md-12">
		   		<p class="pull-right"><a href="#">Back to top</a></p>
		   		<p>&copy; 2015 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
	   		</footer>
   		</div><!-- /.container -->
	   	
	   	<!-- Bootstrap core JavaScript
	   	================================================== -->
	   	<!-- Placed at the end of the document so the pages load faster -->
	   	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	   	<script>window.jQuery || document.write('<script src=""""),_display_(/*103.61*/routes/*103.67*/.Assets.at("lib/jquery/1.11.1/jquery.min.js")),format.raw/*103.112*/(""""><\/script>')</script>
	   	<script src=""""),_display_(/*104.20*/routes/*104.26*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*104.73*/(""""></script>
	   	<script src=""""),_display_(/*105.20*/routes/*105.26*/.Assets.at("javascripts/main.js")),format.raw/*105.59*/(""""></script>
		"""),_display_(/*106.4*/scalajs/*106.11*/.html.scripts("client", routes.Assets.at(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*106.120*/("""
   	"""),format.raw/*107.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,from:String,content:Html,messages:Messages,environment:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(title,from)(content)(messages,environment)

  def f:((String,String) => (Html) => (Messages,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (title,from) => (content) => (messages,environment) => apply(title,from)(content)(messages,environment)

  def ref: this.type = this

}


}

/**/
object main_org extends main_org_Scope0.main_org
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 04:13:57 KST 2016
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/main_org.scala.html
                  HASH: 71dc0a94369b29e6cd0f12bcb7619fdc8dfa8ba4
                  MATRIX: 575->1|779->109|807->111|1258->536|1284->541|1387->617|1402->623|1455->655|1547->720|1562->726|1629->771|1712->827|1727->833|1782->867|1858->917|1886->936|1926->938|1955->940|2049->1012|2083->1014|2116->1020|2797->1674|2812->1680|2851->1698|2881->1701|2926->1725|3184->1956|3209->1972|3249->1974|3295->1989|3333->2000|3348->2006|3386->2023|3416->2026|3466->2054|3517->2078|3542->2094|3582->2096|3628->2111|3666->2122|3681->2128|3719->2145|3749->2148|3799->2176|3850->2200|3876->2217|3916->2219|3962->2234|4000->2245|4015->2251|4054->2269|4084->2272|4135->2301|4186->2325|4213->2343|4253->2345|4299->2360|4337->2371|4352->2377|4392->2396|4422->2399|4474->2429|5053->2981|5098->3005|5168->3048|5215->3074|5285->3117|5327->3138|5356->3139|5588->3343|5634->3367|5664->3368|6261->3939|6289->3946|6328->3958|7606->5208|7622->5214|7690->5259|7761->5302|7777->5308|7846->5355|7905->5386|7921->5392|7976->5425|8018->5440|8035->5447|8167->5556|8200->5561
                  LINES: 20->1|25->1|27->3|38->14|38->14|40->16|40->16|40->16|42->18|42->18|42->18|43->19|43->19|43->19|48->24|48->24|48->24|48->24|48->24|48->24|49->25|59->35|59->35|59->35|59->35|59->35|64->40|64->40|64->40|64->40|64->40|64->40|64->40|64->40|64->40|65->41|65->41|65->41|65->41|65->41|65->41|65->41|65->41|65->41|66->42|66->42|66->42|66->42|66->42|66->42|66->42|66->42|66->42|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|79->55|79->55|80->56|80->56|81->57|81->57|81->57|83->59|83->59|83->59|99->75|99->75|101->77|127->103|127->103|127->103|128->104|128->104|128->104|129->105|129->105|129->105|130->106|130->106|130->106|131->107
                  -- GENERATED --
              */
          