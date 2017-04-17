package command

class SmsJob extends Job {

  var smsMsg: Option[Sms] = None: Option[Sms]
  def setSms(sms: Sms): Unit = {
    smsMsg = Some(sms)
  }

  override def run(): Unit = {
    smsMsg.get.sendSms
  }
}