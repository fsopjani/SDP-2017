package excercise

/**
  * Created by fatos on 26/03/2017.
  */
//class Person(name: String, second: String){
//  val firstName = name
//  val secondName = second
//}

case class Person(name: String, second: String){
}

object Person {
  def apply(fullName: String): Person = {
    val name = fullName.split(" ")
    new Person(name(0), name(1))
  }

}