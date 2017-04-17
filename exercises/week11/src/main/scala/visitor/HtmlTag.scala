package visitor

abstract class HtmlTag extends Element {
  def getTagName(): String
  def setStartTag(tag: String): Unit
  def getStartTag(): String
  def getEndTag(): String
  def setEndTag(tag: String): Unit

  //not too sure about the below.
  def setTagBody(tagBody: String): Unit = throw new UnsupportedOperationException("Not Used")
  def addChildTag(htmlTag: HtmlTag): Unit = throw new UnsupportedOperationException("Not Used")
  def removeChildTag(htmlTag: HtmlTag): Unit = throw new UnsupportedOperationException("Not Used")
  def getChildren(): List[HtmlTag] = throw new UnsupportedOperationException("Not Used")
  def generateHtml(): Unit
}
