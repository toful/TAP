package Exam4
/*

3.  Dada  esta lista de Accounts:
 val accounts = List(Account(Owner("pedro","123"),1000), Account(Owner("bob","456"),500),Account(Owner("marge","666"),18000))
 Calcular el nombre del cliente mas rico de la lista de tres maneras: usando foldRight, sortWith y maxBy

*/
case class Owner(name:String, id:String){}

case class Account(owner: Owner, balance:Int)

object Ex3 extends scala.App {

  def maxBalance(a:Account, b:Account)=if(a.balance>b.balance) a else b

  def ex3_1(list:List[Account]):String= list.foldRight (Account(Owner("",""),Int.MinValue)) (maxBalance).owner.name

  def ex3_2(list:List[Account]):String= list.sortWith((a,b)=> a.balance>b.balance).head.owner.name

  def ex3_3(list:List[Account]):String= list.maxBy(_.balance).owner.name


  val accounts = List(Account(Owner("pedro","123"),1000), Account(Owner("bob","456"),500),Account(Owner("marge","666"),18000))

  println(ex3_1(accounts))
  println(ex3_2(accounts))
  println(ex3_3(accounts))
}

