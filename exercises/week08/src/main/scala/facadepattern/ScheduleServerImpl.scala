package facadepattern

//TODO

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting: Unit = {
    println("startBooting")
  }

  override def readSystemConfigFile: Unit = {
    println("readSystemConfigFile")
  }

  override def init: Unit = {
    println("init")
  }

  override def initializeContext: Unit = {
    println("initializeContext")
  }

  override def initializeListeners: Unit = {
    println("initializeListeners")
  }

  override def createSystemObjects: Unit = {
    println("createSystemObjects")
  }

  override def releaseProcesses: Unit = {
    println("releaseProcesses")
  }

  override def destory: Unit = {
    println("destory")
  }

  override def destroySystemObjects: Unit = {
    println("destroySystemObjects")
  }

  override def destoryListeners: Unit = {
    println("destoryListeners")
  }

  override def destoryContext: Unit = {
    println("destoryContext")
  }

  override def shutdown: Unit = {
    println("shutdown")
  }
}
