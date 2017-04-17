package factorymethod


/**
  * Created by fatos on 30/03/2017.
  */
trait Product {

}

class Creator {
  def apply(s: String):Product = s match {
    case "one" => new ConcreteProduct1()
    case "two" => new ConcreteProduct2()
    case _ => new ConcreteProduct()
  }
}

case class ConcreteProduct() extends Product

case class ConcreteProduct1() extends Product

case class ConcreteProduct2() extends Product

class ConcreteCreator() extends Creator {
  def getConcreteInstance(s: String): Product = s match {
    case "one" => new ConcreteProduct1()
    case "two" => new ConcreteProduct2()
  }
}



object FactoryMethodDesignPatternClient extends App{
  val concreteCreator = new ConcreteCreator
  val creator = new Creator

  println(concreteCreator)
  println(creator.apply("one"))
}
