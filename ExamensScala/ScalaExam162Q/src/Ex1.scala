import scala.annotation.tailrec

/**
 * Created by pedro on 13/01/16.
 */

object Ex1 extends scala.App{

def min(ints: List[Int]): Int = {
  @tailrec
  def minAccum(ints: List[Int], theMin: Int): Int = {
    ints match {
      case Nil => theMin
      case x :: tail =>
        val newMin = if (x < theMin) x else theMin
        minAccum(tail, newMin)
    }
  }
  minAccum(ints, Int.MaxValue)
}

println(min(List(3,50,6,7,8,2,9)))


}