package decorator

/**
  * Created by fatos on 04/04/2017.
  */
class PizzaDecorator (pizza: Pizza) extends Pizza {
  def getDesc: String = pizza.getDesc

  def getPrice: Double = pizza.getPrice
}
