package composite

import scala.collection.mutable.ListBuffer
abstract class HtmlTag(tagName: String) {

  var elements = new ListBuffer[HtmlTag]()

  var tagBody = ""

  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String): Unit = {
    this.tagBody = tagBody
  }

  def addChildTag(htmlTag: HtmlTag): Unit = {
    elements.+=:(htmlTag)
  }

  def removeChildTag(htmlTag: HtmlTag): Unit = {
    elements.-=(htmlTag)
  }

  def getChildren: List[HtmlTag] = elements.toList

  def generateHtml
}