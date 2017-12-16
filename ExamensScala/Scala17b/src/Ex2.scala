
import scala.io.Source

import scala.collection.mutable.Map

case class Account(id :String, owner:String, kind:String, balance:Long)

object Ex2 extends scala.App {

  def getLines = {
    val src = Source.fromFile("accounts.txt")
    val iter = src.getLines().map(_.split(",")).toList
    src.close()
    iter
  }
  def getAccount(line: Array[String]): Account = Account(line(0), line(1), line(2), line(3).toLong)

  val accounts = getLines.map(line => getAccount(line))

//a)
  println(accounts.groupBy(_.owner))
  val byOwner = accounts.groupBy(_.owner)
// b)
  val budgets = byOwner.mapValues(_.map(_.balance).sum)
  println(budgets)

// c)
  println(accounts.maxBy(_.balance).owner)



}
