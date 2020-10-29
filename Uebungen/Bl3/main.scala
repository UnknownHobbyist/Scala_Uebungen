object Main {

  //name, email, tel.-nr.

  def main(args: Array[String]): Unit = {

    //Aufgabe 1
    type Contact = (String, String, String)
    import CONTACT._
    val contacts = List[Contact](
      ("0x539", "0x539@supergen.io", "2374623874623"),
      ("Carepoin", "Carepoin@supergen.io", "23427634872634"),
      ("dkhaled keshooc", "dkhaled.keshooc@sceenic.com", "8789234234"),
      ("hmarocpolitique1f", "hmarocpolitique1f@ericreyess.com", "09787231123")
    )

    println("List: \n" + CONTACT.getEmailAdresses(contacts))
    println("Name: " + CONTACT.getNameByTelNum(contacts, "8789234234"))



    //Aufgabe 2

    println(binKoeff(6, 3))
    println(binKoeffRek(1, 0))


    //Aufgabe 4
    val x = List(1, 2, 3, 4, 5, 6) match {
      case List(x, 2, 4, _) => 1
      case Nil => 2
      case List(x, y, 3, z, 5, _) => 3
      case _ => 42
    }
    val y = List(1, 2, 3, 4) match {
      case List(_) => 1
      case 1::2::3::4::List() => 2
      case List(_, _, _, _) => 3
      case _ => 42
    }
    val z = List(1, 2, 3, 4, 5) match {
      case List(a, b) => 1
      //case List(a, b):::3::c => 2
      case 1::List(2, 3, 4, 5) => 3
      case _ => 42
    }
    //3, 2, 3 (case 2 in z throws an error since 3 is not an array/a list)
    print(x, y, z)



  }

  def binKoeff(m: Int, n: Int): Int = {
    def fac(x: Int): Int = {
      if(x == 0)
        return 1

      return x * fac(x-1)
    }

    if(n > m || m < 0 || n < 0)
      return -1

    return fac(m) / (fac(n) * fac(m - n))
  }

  def binKoeffRek(m: Int, n: Int): Int = {
    if(n == 0 || m == n)
      return 1

    return binKoeffRek(m-1, n) + binKoeffRek(m-1, n-1)
  }

}
