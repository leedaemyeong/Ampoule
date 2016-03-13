
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, from: String)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

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
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*18.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*19.101*/("""">
        
        
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
	   	<script>window.jQuery || document.write('<script src=""""),_display_(/*103.61*/routes/*103.67*/.Assets.versioned("lib/jquery/1.11.1/jquery.min.js")),format.raw/*103.119*/(""""><\/script>')</script>
	   	<script src=""""),_display_(/*104.20*/routes/*104.26*/.Assets.versioned("lib/bootstrap/js/bootstrap.min.js")),format.raw/*104.80*/(""""></script>
	   	<script src=""""),_display_(/*105.20*/routes/*105.26*/.Assets.versioned("javascripts/main.js")),format.raw/*105.66*/(""""></script>
   	</body>
</html>
"""))
      }
    }
  }

  def render(title:String,from:String,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,from)(content)(messages)

  def f:((String,String) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,from) => (content) => (messages) => apply(title,from)(content)(messages)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Mar 13 10:53:45 KST 2016
                  SOURCE: /home/myeong/workspace/tbob/app/views/main.scala.html
                  HASH: 1b98436a8ce4e12d7ade2e9c86de729f298d60aa
                  MATRIX: 546->1|714->74|742->76|1193->501|1219->506|1322->582|1337->588|1398->627|1490->692|1505->698|1579->750|1662->806|1677->812|1740->853|1816->903|1844->922|1884->924|1913->926|2007->998|2041->1000|2074->1006|2755->1660|2770->1666|2809->1684|2839->1687|2884->1711|3142->1942|3167->1958|3207->1960|3253->1975|3291->1986|3306->1992|3344->2009|3374->2012|3424->2040|3475->2064|3500->2080|3540->2082|3586->2097|3624->2108|3639->2114|3677->2131|3707->2134|3757->2162|3808->2186|3834->2203|3874->2205|3920->2220|3958->2231|3973->2237|4012->2255|4042->2258|4093->2287|4144->2311|4171->2329|4211->2331|4257->2346|4295->2357|4310->2363|4350->2382|4380->2385|4432->2415|5011->2967|5056->2991|5126->3034|5173->3060|5243->3103|5285->3124|5314->3125|5546->3329|5592->3353|5622->3354|6219->3925|6247->3932|6286->3944|7564->5194|7580->5200|7655->5252|7726->5295|7742->5301|7818->5355|7877->5386|7893->5392|7955->5432
                  LINES: 20->1|25->1|27->3|38->14|38->14|40->16|40->16|40->16|42->18|42->18|42->18|43->19|43->19|43->19|48->24|48->24|48->24|48->24|48->24|48->24|49->25|59->35|59->35|59->35|59->35|59->35|64->40|64->40|64->40|64->40|64->40|64->40|64->40|64->40|64->40|65->41|65->41|65->41|65->41|65->41|65->41|65->41|65->41|65->41|66->42|66->42|66->42|66->42|66->42|66->42|66->42|66->42|66->42|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|79->55|79->55|80->56|80->56|81->57|81->57|81->57|83->59|83->59|83->59|99->75|99->75|101->77|127->103|127->103|127->103|128->104|128->104|128->104|129->105|129->105|129->105
                  -- GENERATED --
              */
          