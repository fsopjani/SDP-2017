package chain

case class VideoFileHandler(s: String) extends Handler {

  var next: Option[Handler] = None: Option[Handler]

  override def setHandler(handler: Handler): Unit = {
    next = Some(handler)
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("video")) {
      println(s"Process and saving video file... by $getHandlerName")
    }
    else {
      println("Video Handler forwards request to Image Handler")
      next.get.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
