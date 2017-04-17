package abstractfactory

/**
  * Created by fatos on 11/04/2017.
  */
class LondonFactory extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "LondonORDER" => new LondonOrderXMLParser()
    case "LondonFEEDBACK" => new LondonFeedbackXML()
    case "LondonERROR" => new LondonErrorXMLParser()
    case "LondonRESPONSE" => new LondonResponseXMLParser()
  }
}
