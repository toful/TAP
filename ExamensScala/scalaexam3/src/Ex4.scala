/**
 * Created by pedro on 25/11/15.
 */


object Ex4 extends scala.App {



  def ex4a[T](f:(T,T)=>Boolean,l1:List[T],l2:List[T]):List[(T,T)]= (l1,l2) match {
    case (Nil,_)=> Nil
    case (_,Nil)=> Nil
    case (x::xs,y::ys)=> if (f(x,y)) (x,y)::ex4a(f,xs,ys) else ex4a(f,xs,ys)
  }


  def ex4b[T](f:(T,T)=>Boolean,acc:List[(T,T)],l1:List[T],l2:List[T]):List[(T,T)]= (l1,l2) match {
    case (Nil,_)=> acc.reverse
    case (_,Nil)=> acc.reverse
    case (x::xs,y::ys)=> if (f(x,y)) ex4b(f,(x,y)::acc,xs,ys) else ex4b(f,acc,xs,ys)
  }

  println(ex4a((a:Int,b:Int)=>a>b, List(1,4,8),List(1,3,5)))

  println(ex4b((a:Int,b:Int)=>a>b,Nil,List(1,4,8),List(1,3,5)))





}