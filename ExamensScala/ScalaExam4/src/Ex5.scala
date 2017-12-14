/**
 * Created by pedro on 27/11/15.
 */

object Ex5 extends scala.App {


  def max(x:Int,y:Int):Int = if (x>y)  x else y
  def concat(x:String,y:String) = x++y

  val max_lists = ex5(max,0,_:List[Int], _:List[Int])

  val concat_lists = ex5(concat,"",_:List[String], _:List[String])


  println (max_lists(List(1,6,4,7),List(99,23,1,5)))

  println (concat_lists(List("hola","amigo","mio"),List("aprobare","tap", "seguro")))



  def ex5[T](f: (T,T) => T, default:T, list: List[T], list2:List[T]): T = (list,list2) match {
    case (Nil,_) => default
    case (_,Nil) => default
    case (x :: xs, y::ys) => f(f(x,y),ex5(f,default,xs,ys))

  }


}