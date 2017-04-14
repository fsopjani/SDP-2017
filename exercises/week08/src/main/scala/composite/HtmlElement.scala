package composite

// TODO
case class HtmlElement(s: String) extends HtmlTag(s) {
  var startTag = ""
  var endTag = ""
  override def setStartTag(tag: String): Unit = {
    startTag = tag
  }

  override def setEndTag(tag: String): Unit = {
    endTag = tag

  }

  override def generateHtml: Unit = {
    println(startTag + tagBody + endTag)
  }
}
