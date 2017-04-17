package command

class LoggingJob extends Job {

  var log: Option[Logging] = None: Option[Logging]
  def setLogging(logging: Logging): Unit = {
    log = Some(logging)
  }

  override def run(): Unit = {
    log.get.log
  }
}