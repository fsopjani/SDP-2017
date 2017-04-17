package chain

case class AudioFileHandler(s: String) extends Handler {

  var next: Option[Handler] = None: Option[Handler]

  override def setHandler(handler: Handler): Unit = {
    next = Some(handler)
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("audio")) {
      println(s"Process and saving audio file... by $getHandlerName")
    }
    else {
      println("Audio Handler forwards request to Video Handler")
      next.get.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
