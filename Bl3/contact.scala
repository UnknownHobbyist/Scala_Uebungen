object CONTACT{  
  type Contact = (String, String, String)

  def getEmailAdresses(contacts: List[Contact]): String = {
    if(contacts.length == 0)
      return ""

    return contacts.head._2 + "\n" + getEmailAdresses(contacts.tail)
  }

  def getNameByTelNum(contacts: List[Contact], telnum: String): String = {
    if(contacts.length == 0)
      return ""

    if(contacts.head._3 == telnum)
      return contacts.head._1

    return getNameByTelNum(contacts.tail, telnum)
  }
}