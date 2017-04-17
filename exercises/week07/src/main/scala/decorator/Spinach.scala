package decorator

class Spinach(val pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = pizza.getDesc

  override def getPrice: Double = pizza.getPrice
}