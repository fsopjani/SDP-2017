package abstractfactory

/**
  * Created by fatos on 11/04/2017.
  */
class NYCErrorXMLParser extends XMLParser{
  override def parse: String = "NYC Parsing Error XML... \nNYC Error XML Message"
}

class NYCFeedbackXML extends XMLParser{
  override def parse: String = "NYC Parsing Feedback XML... \nNYC Feedback XML Message"
}


class NYCOrderXMLParser extends XMLParser{
  override def parse: String = "NYC Parsing Order XML... \nNYC Order XML Message"
}

class NYCResponseXMLParser extends XMLParser{
  override def parse: String = "NYC Parsing Response XML... \nNYC Response XML Message"
}