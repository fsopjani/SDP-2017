package proxy.protectedproxy

trait ReportGenerator {
  def generateDailyReport(): String
}

class ReportGeneratorImpl extends ReportGenerator{
  override def generateDailyReport(): String = {
    "********************Location X Daily Report********************" +
      "\nLocation ID: 012" +
      "\nToday’s Date: Sun Sep 39 00:11:23 GMT 2016" +
      "\nTotal Pizza Sell: 112" +
      "\nTotal Sale: $2534" +
      "\nNet Profit: $1985" +
      "\n***************************************************************"
  }
}

