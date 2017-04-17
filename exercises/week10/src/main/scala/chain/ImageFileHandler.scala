package chain

case class ImageFileHandler(s: String) extends Handler {

  override def setHandler(handler: Handler): Unit = {
    println("no body")
  }

  override def process(file: File): Unit = {
    if (file.fileType.equalsIgnoreCase("image")) {
      println(s"Process and saving image file... by $getHandlerName")
    }
    else {
      println("File not supported")
    }
  }

  override def getHandlerName(): String = {
    "Image Handler"
  }
}
