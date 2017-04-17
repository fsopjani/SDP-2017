package excercise

/**
  * Created by fatos on 26/03/2017.
  */
case class Counter(n: Int = 0){
  def inc =  this.copy(n + 1)
  def dec = this.copy(n - 1)
  val count = n

  def adjust(adder: Adder): Counter = {
    Counter.apply(adder.add(n))
  }

}
