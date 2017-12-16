


import Ex2.{getAccount, getLines}
import Ex4.partition_folder

object Ex5 extends scala.App {



  def  balances (owner:String,list:List[Account]) = {
    val list_partition = partition_folder(0L,_:List[Account],(acc:Account)=>acc.owner.equals(owner),(ac1:Account,bal:Long)=>ac1.balance+bal)
    list_partition(list)
  }


  val accounts:List[Account] = getLines.map(line => getAccount(line))

  println(balances("barcenas",accounts))
  println(balances("pere",accounts))



}
