/**
  * Created by Tòful.
  */

object Exercice1 extends scala.App{

  def max(x:Int, y: Int): Int={
    if(x>y) x;
    else y;
  }

  def min(x:Int, y: Int): Int={
    if(x<y) x;
    else y;
  }

  def concat(s1: String, s2: String): String={
    s1.concat(s2);
  }

  val  list1 = List.range(1,100)

  println(list1.foldLeft (0) (max));

  println(list1.foldLeft (0) (min));

  val list2 = List("M","A","N","U"," ","C","A","R","E","T","O");
  println(list2.foldLeft ("") (concat));

  def filter [T](xs : List[T], f: T => Boolean): List[T] = xs match {
    case Nil => Nil
    case x :: xs =>
      if (f(x)) x::filter(xs, f)
      else filter (xs, f)

  }

  def filter2 [T](xs : List[T], f: T => Boolean): List[T] ={
    def filterAccum [T](xs : List[T], f: T => Boolean, accum : List[T]): List[T] = xs match{
      case Nil => accum.reverse
      case x :: xs =>
        if (f(x)) filterAccum(xs, f, x::accum)
        else filterAccum(xs, f, accum)
    }
    filterAccum(xs, f, Nil)
  }

  println(filter (list1, (x:Int)=> x%2==0))
  println(filter2 (list1, (x:Int)=> x%2==0))

  def reduce [T](f: (T,T) => T, default: T, xs: List[T]): T= xs match{
    case Nil => default
    case x :: xs => f(x, reduce(f,default,xs))
  }

  def reduceAccum [T](f: (T,T) => T, default: T, xs: List[T]): T= xs match{
    case Nil => default
    case x :: xs => reduceAccum(f, f(x,default), xs)
  }

  /*def reduce2 [T](f: (T,T) => T, xs: List[T]): Any= {
    reduceAccum(f, 0, xs)
  }*/

  println(reduce (((x: Int ,y:Int)=> x+y), 0, list1))
  println(reduceAccum(((x: Int ,y:Int)=> x+y),0,list1))
}

