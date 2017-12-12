/**
 * Created by pedro on 14/01/16.
 */

case class Book1(author:String,cost:Int)

object Ex5 extends scala.App{

  def min[T](less:(T,T)=>Boolean) (ints: List[T])(initial:T) (theMin:T): T = {
    ints match {
      case Nil => theMin
      case x :: tail =>
        val newMin:T = if (less(x,theMin)) x else theMin
        min (less) (tail) (initial) (newMin)
    }
  }

  val books = List(Book1("Asimov",112),Book1("Leguin",34),Book1("Asimov",40))


  def bookless(a:Book1,b:Book1):Boolean = a.cost<b.cost

  println(min(bookless) (books) (books.head) (books.head))

  val minBook = min (bookless) _

  println(minBook (books) (books.head) (books.head))


}