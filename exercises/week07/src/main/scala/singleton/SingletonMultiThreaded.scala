package singleton

/**
  * Created by fatos on 02/04/2017.
  */
case class SingletonMultiThreaded private() {}
object SingletonMultiThreaded {

  private var instance: SingletonMultiThreaded = null

  def getInstance: SingletonMultiThreaded = {
    if (instance == null) classOf[SingletonMultiThreaded] synchronized {
      if (instance == null) {
        instance = new SingletonMultiThreaded
      }
    }
    instance
  }

  override def clone(): AnyRef = {
    throw new CloneNotSupportedException("Singleton, cannot be cloned")
  }

}


