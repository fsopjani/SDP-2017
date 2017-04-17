package xpay

/**
  * Created by fatos on 30/03/2017.
  */
class XpayToPayDAdapter( var payD: PayD)extends Xpay{
  override def getCreditCardNo: String = {
    payD.getCustCardNo
  }

  override def setCreditCardNo(creditCardNo: String): Unit = {
    payD.setCustCardNo(creditCardNo)
  }

  override def getCustomerName: String = {
    payD.getCardOwnerName
  }

  override def setCustomerName(customerName: String): Unit = {
    payD.setCardOwnerName(customerName)
  }

  //format dd-mm-yyyy
  override def getCardExpMonth: String = payD.getCardExpMonthDate.split("-")(0)

  //format dd-mm-yyyy
  override def setCardExpMonth(cardExpMonth: String): Unit = {
    payD.setCardExpMonthDate(payD.getCardExpMonthDate.split("-")(1))
  }
  //format dd-mm-yyyy
  override def getCardExpYear: String = {
    payD.getCardExpMonthDate.split("-")(2)
  }

  //format dd-mm-yyyy
  override def setCardExpYear(cardExpYear: String): Unit = {
    payD.setCardExpMonthDate(payD.getCardExpMonthDate.split("-")(2))
  }

  override def getCardCVVNo: Short = payD.getCVVNo.toShort

  override def setCardCVVNo(cardCVVNo: Short): Unit = {
    payD.setCVVNo(cardCVVNo.toInt)
  }

  override def getAmount: Double = payD.getTotalAmount

  override def setAmount(amount: Double): Unit = {
    payD.setTotalAmount(amount)
  }
}
