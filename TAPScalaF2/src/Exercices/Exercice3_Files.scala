/*Exercise 3: We will import information from the accounts.txt file in CSV format (Comma separated values). Use Files.
Import this information in a List of Accounts where the four parameters correspond to:
  id :String, owner:String, kind:[IF,CA,BA,SA], balance:Int
  ** you do not need to use enums, use Strings **

Perform the following operations:
 Use map to increment the balance of all accounts in 10 euros
 Use filter to obtain all account of kind IF
 Use max to obtain the account with the highest balance
 Combine filter and max to obtain the IF account with higher balance*/

import scala.io.Source

case class Account (val id:String, val owner:String, val kind:String, val balance:Long)

object Exercice3_Files extends scala.App {

  val src = Source.fromFile("accounts.txt")
  val iter = src.getLines().map(_.split(",")).toList
  src.close()

  def getAccount(line: Array[String]): Account = Account(line(0), line(1), line(2), line(3).toLong)

  val accounts = iter.map(line => getAccount(line))

  accounts.map(x=>println(x))

  println("\nIncrementem el balanç de tots els comptes en 10€")
  val result1 = accounts.map(x=> Account(x.id, x.owner, x.kind, x.balance+10))
  result1.foreach(println)

  println("\nObtenim els comptes IF")
  val result2 = accounts.filter(x=>x.kind.equals("IF"))
  result2.foreach(println)

  println("\nObtenim el compte amb més diners")
  val result3 = accounts.maxBy(_.balance)
  println(result3)

  println("\nObtenim el compte If amb més diners")
  val result4 = accounts.filter(x=>x.kind.equals("IF")).maxBy(_.balance)
  println(result4)
}
