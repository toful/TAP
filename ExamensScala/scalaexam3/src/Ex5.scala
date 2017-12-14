/**
 * Created by pedro on 11/26/15.
 */



object Ex5 extends scala.App {

  val l = List(1,2,3,4,5,6)


  def ex5a[T](f:(T,T)=>Boolean) (l1:List[T]) (l2:List[T]):List[(T,T)]= (l1,l2) match {
    case (Nil,_)=> Nil
    case (_,Nil)=> Nil
    case (x::xs,y::ys)=> if (f(x,y)) (x,y)::ex5a(f) (xs) (ys) else ex5a(f) (xs) (ys)
  }

  println(ex5a ((a:Int,b:Int)=>a>b) (List(1,4,8)) (List(1,3,5)))
  val odds = ex5a ((a:Int,b:Int)=> (a%2==0 && b%2==0)) (_:List[Int]) _

  println (odds (List(1,2,3,4,5)) (List(1,2,3,4,5)))

  println (odds (List(1,2,3,4,5)) (List(1,6,3,8,2)))

}