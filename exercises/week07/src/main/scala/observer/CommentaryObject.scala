package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject with Commentary {
  def subscribeObserver(observer: Observer): Unit = {
    subscribers += observer
  }

  def unSubscribeObserver(observer: Observer): Unit = {
    subscribers -= observer
  }

  def notifyObservers(): Unit = {
    for (subscriber <- subscribers) {
      subscriber.update(title)
    }
  }
//not sure about what this is meant to do.
  def subjectDetails: String = {
    println("title:" + title)
    title
  }

  override def setDesc(desc: String): Unit = {
    println("setting new description:" + desc)
    notifyObservers()
  }
}
