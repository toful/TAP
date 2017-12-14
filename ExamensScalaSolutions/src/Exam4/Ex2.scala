package Exam4
/*
2. Implementa la funcion replace del primer ejercicio pero utilizando funciones nativas de listas (filter, map,foldright).
*/

object Ex2 extends scala.App {

  def replace[T](list:List[T],list2:List[T],value:T): List[T]={
    list.map(elem =>if(list2.contains(elem))value else elem)
  }

  val list = List(1,2,3,4,5,4,7,4,9)
  val veto = List(3,7)
  println(replace(list,veto,0))

}

