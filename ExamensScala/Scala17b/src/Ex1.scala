
object Ex1 extends scala.App {


  def zipWith[T](l:List[T]):List[(T,Int)]= {
    def aux[T](l: List[T], cnt: Int): List[(T, Int)] = l match {
      case Nil => Nil
      case x :: xs => (x, cnt) :: aux(xs, cnt + 1)
    }

    aux(l, 0)
  }

  println(zipWith(List("a","b","c")))


  def zipWith2[T](l:List[T]):List[(T,Int)]= {
    def accumm[T](l: List[T], acc:List[(T,Int)],cnt: Int): List[(T, Int)] = l match {
      case Nil => acc.reverse
      case x :: xs => accumm(xs,(x,cnt)::acc, cnt + 1)
    }

    accumm(l,Nil,0)
  }
  println(zipWith2(List("a","b","c")))


}