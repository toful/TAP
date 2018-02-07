package Exam5
/*val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(central(list))

 Resultado: (22,List(2, 4, 8, 11, 11),List(33, 56, 67, 76, 343))


2. Escribe la misma función central del ejercicio 1 pero utilizando las funciones de listas del propio lenguaje (map, filter, ...)

*/
object Ex2 extends scala.App{
  def ex2(l:List[Int]):(Int, List[Int], List[Int]) ={
    (l.head, l.tail.filter(_<l.head).sorted, l.tail.filter(_>l.head).sorted)
  }

  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(ex2(list))
}
