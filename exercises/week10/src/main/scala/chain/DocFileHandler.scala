package chain

case class DocFileHandler(s: String) extends Handler {

  var next: Option[Handler] = None: Option[Handler]

  override def setHandler(handler: Handler): Unit = {
    next = Some(handler)
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("doc")) {
      println(s"Process and saving doc file... by $getHandlerName")
    }
    else {
      println("Doc Handler forwards request to Excel Handler")
      next.get.process(file)
    }
  }

  override def getHandlerName(): String = {s}
}
