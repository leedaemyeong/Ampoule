
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[RequestHeader,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),_display_(/*3.2*/main("Ampoule for your beautiful life")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""

"""),format.raw/*5.1*/("""<!-- Jumbotron -->
<div class="jumbotron">
  <h1>Marketing stuff!</h1>
  <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
  <p><a class="btn btn-lg btn-success" href="#" role="button">Get started today</a></p>
</div>

<!-- Example row of columns -->
<div class="row">
  <div class="col-lg-4">
    <h2>Safari bug warning!</h2>
    <p class="text-danger">As of v9.1.2, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>
    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
    <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
  </div>
  <div class="col-lg-4">
    <h2>Heading</h2>
    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
    <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
  </div>
  <div class="col-lg-4">
    <h2>Heading</h2>
    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.</p>
    <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
  </div>
</div>




""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply()(request,messages,webJarAssets)

  def f:(() => (RequestHeader,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = () => (request,messages,webJarAssets) => apply()(request,messages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Jan 08 06:56:25 KST 2017
                  SOURCE: /home/myeong/workspace/Ampoule/server/app/views/index.scala.html
                  HASH: 6191d7e6c061f1650d6af7037ff741cf29cc095f
                  MATRIX: 556->1|734->84|762->87|809->126|848->128|876->130|2673->1897
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|59->35
                  -- GENERATED --
              */
          