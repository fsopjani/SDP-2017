package excercise

/**
  * Created by fatos on 26/03/2017.
  */
case class Director(firstName: String, lastName: String, yearOfBirth: Int){
  def name: String = firstName + " " + lastName
}

object Director{
//  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
//    new Director(firstName, lastName, yearOfBirth)

  def older(d1: Director, d2 : Director): Director = {
    if (d1.yearOfBirth > d2.yearOfBirth) d1 else d2
  }

}
