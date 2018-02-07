/**
 * Created by pedro on 25/11/15.
 */


object Ex4 extends scala.App {

  val l = List(1,2,3,4,5,6)


  def greater(x:Int)= x>4
  def sum(x:Int,y:Int)=x+y

  println(ex4b(0,sum,greater,l))


  println(ex4(0,sum,greater,l))




  def ex4[T](result: T, f: (T, T) => T, f2:(T)=>Boolean,xs: List[T]): T = xs match {
    case Nil => result
    case x :: xs => if (f2(x)) f(x, ex4(result, f, f2, xs)) else f(result,ex4(result, f, f2, xs))
  }

  def ex4b[T](result: T, f: (T, T) => T, f2:(T)=>Boolean,xs: List[T]): T = xs match {
    case Nil => result
    case x :: xs => ex4b(if (f2(x)) f(x,result) else result,f,f2,xs)
  }


}