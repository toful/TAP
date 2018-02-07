import Ex2.{getAccount, getLines}


object Ex4 extends scala.App {


def partition_folder [T,R](default:R,list:List[T],f:T=>Boolean, f2:(T,R)=>R):(R,R)= {
  def aux[T,R](list:List[T],l1:R,l2:R,f:T=>Boolean, f2:(T,R)=>R):(R,R)= list match {
    case Nil=> (l1,l2)
    case x::xs => if (f(x)) aux(xs,f2(x,l1),l2,f,f2) else  aux(xs,l1,f2(x,l2),f,f2)
  }
  aux(list,default,default,f,f2)
}


val accounts:List[Account] = getLines.map(line => getAccount(line))


val result = partition_folder(0L,accounts,(acc:Account)=>acc.owner.equals("barcenas"),(ac1:Account,bal:Long)=>ac1.balance+bal)

println(result)


}
