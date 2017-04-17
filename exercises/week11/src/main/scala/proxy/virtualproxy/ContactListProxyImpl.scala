package proxy.virtualproxy

import scala.collection.mutable.ListBuffer

class ContactListProxyImpl extends ContactList {

  private var contactList: ContactList = new ContactListImpl

  override def employeeList: ListBuffer[Employee] = {
    println("Creating contact list and fetching list of employees...")
    contactList.employeeList
  }

}
