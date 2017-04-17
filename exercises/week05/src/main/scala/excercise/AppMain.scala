package excercise

/**
  * Created by fatos on 26/03/2017.
  */
object AppMain extends App{
  val c = new Counter(10)
  val adder = new Adder(5)
  println(c.adjust(adder).n)
 }
