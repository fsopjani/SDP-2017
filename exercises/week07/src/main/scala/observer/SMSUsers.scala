package observer

class SMSUsers(s: Subject, msg: String) extends Observer {

  //not too sure
  def update(desc: String): Unit = {
    println("update desc: " + desc)
  }

  def subscribe(): Unit = {
    println(msg)
    s.subscribeObserver(this)
  }

  def unSubscribe(): Unit = {
    s.unSubscribeObserver(this)
  }
}
