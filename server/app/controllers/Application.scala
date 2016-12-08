package controllers

import play.api.mvc._
import com.google.inject.Inject
import play.api.i18n._

class Application @Inject() (
  val messagesApi: MessagesApi,
  implicit val webJarAssets: WebJarAssets)
  extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }

  def shop = Action { implicit request =>
    Ok(views.html.shop())
  }

  def blog = Action { implicit request =>
    Ok(views.html.blog())
  }

  def learn = Action { implicit request =>
    Ok(views.html.learn())
  }

  def videos = Action { implicit request =>
    Ok(views.html.videos())
  }

}
