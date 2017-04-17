package singleton

/**
  * Created by fatos on 30/03/2017.
  */
class SingletonLazyCheck private (){
  def printHi() = println("hi fatos")

}

object SingletonLazyCheck {
  private var instance: SingletonLazyCheck = null
  def apply(): SingletonLazyCheck = {
    if (instance == null) {
      instance = new SingletonLazyCheck()
    }
    instance
  }
}

object SingletonMain extends App {

  println(SingletonLazyCheck)
  val y = SingletonLazyCheck()
  println(y)
  y.printHi()
  println(y)

}
