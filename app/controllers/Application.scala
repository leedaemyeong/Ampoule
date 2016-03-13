package controllers

import play.api._
import play.api.mvc._
import javax.inject.Inject
import play.api.i18n._

class Application @Inject() (val messagesApi: MessagesApi)
  extends Controller with I18nSupport {

  def index = Action {
    Ok(views.html.index())
  }
  
  def shop = Action {
    Ok(views.html.shop())
  }
  
  def blog = Action {
    Ok(views.html.blog())
  }
  
  def learn = Action {
    Ok(views.html.learn())
  }
  
  def videos = Action {
    Ok(views.html.videos())
  }
  
}
