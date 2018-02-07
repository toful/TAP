/*2. Escribe la misma función count del ejercicio 1 pero utilizando las funciones de listas del propio lenguaje (map, filter, ...)
   Opcional: Reescribir la función usando List.count
*/

object Ex2 extends scala.App {


  def count_2(list:List[Int], value:Int):Int=list.count((elem)=>elem==value)
  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(count_2(list,11))
}