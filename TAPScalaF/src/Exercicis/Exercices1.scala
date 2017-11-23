
object Exercices1 extends scala.App{

  /*-- Write a stack recursive function lower3(list) that adds all numbers whose values are lower than 3 and they
   -- appear in one integer list.*/

  def lower3 (xs: List[Int]): List[Int]= xs match{
      case Nil => Nil
      case x :: xs =>
        if (x<3) x::lower3(xs)
        else lower3(xs)
  }
  def lower3_0 (list: List[Int]): List[Int]={
      def lower3Accum (accum: List[Int], xs: List[Int]): List[Int]= xs match{
        case Nil => accum
        case x :: xs =>
          if (x<3) lower3Accum (x::accum, xs)
          else lower3Accum (accum, xs)
      }
      lower3Accum(Nil, list)
  }

  val list1 = List(1,2,3,4)

  println(list1)
  println(lower3(list1))
  println(lower3_0(list1))




}

