package abstractfactory

/**
  * Created by fatos on 11/04/2017.
  */
class NYCFactory extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "NYCORDER" => new NYCOrderXMLParser()
    case "NYCFEEDBACK" => new NYCFeedbackXML()
    case "NYCERROR" => new NYCErrorXMLParser()
    case "NYCRESPONSE" => new NYCResponseXMLParser()

  }
}
