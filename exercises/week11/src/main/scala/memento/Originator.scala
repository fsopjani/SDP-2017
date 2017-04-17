package memento

case class Originator(
  var x: Double,
  var y: Double,
  var careTaker: CareTaker
) {

  private val momento: Memento = new Memento(x,y)

  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    println(s"Saving state... $savepointName")
    lastUndoSavepoint = savepointName
    careTaker.saveMemento(momento, savepointName)
  }

  def undo(): Unit = {
    careTaker.getMemento(lastUndoSavepoint)
  }

  def undo(savepointName: String): Unit = {
    println(s"Undo at ...$savepointName")
    careTaker.getMemento(savepointName)
  }

  def undoAll(): Unit = {
    println("Clearing all save points...")

    careTaker.clearSavepoints()
  }

  private def setOriginatorState(savepointName: String): Unit = {
    careTaker.getMemento(savepointName) //not too sure
  }

  override def toString(): String = "X: " + x + ", Y: " + y
}
