package chain

case class TextFileHandler(s: String) extends Handler {

  var next: Option[Handler] = None: Option[Handler]

  override def setHandler(handler: Handler): Unit = {
    next = Some(handler)
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("text")) {
      println(s"Process and saving text file... by $getHandlerName")
    }
    else {
      println("Text Handler forwards request to Doc Handler")
      next.get.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
