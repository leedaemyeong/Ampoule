package controllers

import play.api._
import play.api.mvc._
import javax.inject.Inject
import play.api.i18n._

class Test @Inject() (val messagesApi: MessagesApi)
  extends Controller with I18nSupport {

  def index = Action {
    Ok(views.html.writeform())
  }

  def write = Action (parse.text){ implicit request =>
    Ok(views.html.write(request.body))
    //Ok("hello" + request.body)
  }

}
