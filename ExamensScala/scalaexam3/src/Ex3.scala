/**
 * Created by pedro on 25/11/15.
 */


case class Account(owner:Owner,money:Int)
case class Owner(name:String,phone:String)



object Ex3 extends scala.App {


  val accounts = List(Account(Owner("pedro","123"),1000), Account(Owner("bob","456"),500),Account(Owner("marge","666"),18000))



  //Name of the richest client
  def max(b1:Account,b2:Account)= if (b1.money>b2.money) b1 else b2

  println(accounts.foldRight (Account(Owner("",""), Int.MinValue)) (max).owner.name)

  println(accounts.sortWith((a,b)=>a.money>b.money).head.owner.name)

  println(accounts.maxBy(_.money).owner.name)




}

