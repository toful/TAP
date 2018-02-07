import scala.collection.immutable.::

object Exercice2 extends scala.App{

  def lenght[T] (xs:List[T]): Int ={
    def tlength[T](acc:Int, xs:List[T]):Int = xs match {
      case Nil => acc
      case x :: xs => tlength(acc+1,xs)
    }
    tlength(0, xs);
  }

  val list = List.range(1,100)
  println(lenght(list))

  def sumList (xs:List[Int]): Int= xs match{
      case Nil => 0
      case x :: xs => x + sumList(xs)
  }

  def sumList2 (xs:List[Int]): Int={
      def sumListAccum (accum:Int , xs:List[Int]): Int= xs match{
          case Nil => accum
          case x :: xs => sumListAccum(accum+x, xs)
      }
      sumListAccum(0, xs)
  }

  println(sumList(list))
  println(sumList2(list))


}
