package observer

import scala.collection.mutable.ListBuffer

object TestObserver extends App {
    val obj: CommentaryObject = new CommentaryObject(ListBuffer[Observer](),"Soccer Match [2014AUG24]")
    val observer: SMSUsers = new SMSUsers(obj, "Adam Warner [New York]")
    val observer2: SMSUsers = new SMSUsers(obj, "Tim Ronney [London]")
    observer.subscribe
    observer2.subscribe

    println("-"*40)
    obj.setDesc("It's kicking off")
    obj.setDesc("0-0 at the moment")
    observer.unSubscribe
    val observer3: Observer = new SMSUsers(obj, "Observing")
    observer3.subscribe
    obj.setDesc("oops a new listners")
    println(obj.subjectDetails)
    obj.setDesc("it's a bloody goal")
    obj.setDesc("eating a pie at half time")
}
