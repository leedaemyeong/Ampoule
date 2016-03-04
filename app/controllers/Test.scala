package controllers

import play.api._
import play.api.mvc._
import javax.inject.Inject
import play.api.i18n._

import play.api.data._
import play.api.data.Forms._

case class UserData(username: String)

class Test @Inject() (val messagesApi: MessagesApi)
  extends Controller with I18nSupport {

	val userForm = Form(
		mapping(
			"username" -> text
		)(UserData.apply)(UserData.unapply)
	)

  def index = Action {
    Ok(views.html.writeform(userForm))
  }

  def write = Action (parse.text){ implicit request =>
		val userData = userForm.bindFromRequest.get
	  
    //Ok(views.html.write(userData))
		//Ok(userData.username)
		Ok("Hello")
  }

}
