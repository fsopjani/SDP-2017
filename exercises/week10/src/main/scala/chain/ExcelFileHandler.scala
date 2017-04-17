package chain

case class ExcelFileHandler(s: String) extends Handler {

  var next: Option[Handler] = None: Option[Handler]

  override def setHandler(handler: Handler): Unit = {
    next = Some(handler)
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("excel")) {
      println(s"Process and saving excel file... by $getHandlerName")
    }
    else {
      println("Excel Handler forwards request to Audio Handler")
      next.get.process(file)
    }
  }

  override def getHandlerName(): String = {
    "Excel Handler"
  }
}
