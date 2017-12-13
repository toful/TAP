package Exam3

/*2. Usando funciones del lenguaje, crea una funcion que devuelva las palabras que empiecen por "a" y con todos sus caracteres en mayusculas.
*/

object Ex2 extends scala.App {

  //def aUpperCAse(list:List[String])= list.filter(_.startsWith("a")).map(_.toUpperCase)
  def aUpperCAse(list:List[String]):List[String]= list.filter(_.startsWith("a")).map(_.toUpperCase)

  val l=List("pedro","ana","paco","amigo")
  println(aUpperCAse(l))
}
