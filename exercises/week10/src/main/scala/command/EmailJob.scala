package command

class EmailJob extends Job {

  var e: Option[Email] = None: Option[Email]

  def setEmail(email: Email): Unit = {
    e = Some(email)
  }

  override def run(): Unit = {
    e.get.sendEmail()
  }

}