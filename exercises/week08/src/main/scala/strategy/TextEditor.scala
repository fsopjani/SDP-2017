package strategy

// TODO

case class TextEditor(formatter: TextFormatter) {
  def publishText(s: String): Unit = formatter match {
    case _: CapTextFormatter => formatter.format(s)
    case _: LowerTextFormatter => formatter.format(s)
  }
}
