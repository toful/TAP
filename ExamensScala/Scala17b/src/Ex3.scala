import Ex2.{getAccount, getLines}

object Ex3 extends scala.App {



  def partition[T](list:List[T],f:T=>Boolean):(List[T],List[T])= {
    def aux[T](list:List[T],f:T=>Boolean,l1:List[T],l2:List[T]):(List[T],List[T])= list match {
      case Nil=> (l1,l2)
      case x::xs => if (f(x)) aux(xs,f,x::l1,l2) else  aux(xs,f,l1,x::l2)
    }
   aux(list,f,Nil,Nil)
  }

  val accounts:List[Account] = getLines.map(line => getAccount(line))


  val result = partition(accounts,(acc:Account)=>acc.owner.equals("barcenas"))

  println(result)



}
