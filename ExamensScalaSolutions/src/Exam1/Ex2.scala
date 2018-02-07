package Exam1

/*2.. Implementa la funcion "ex2" que recibe una lista de palabras y retorna solo aquellas con mas de 6 caracteres.
Ademas, si contienen el caracter 'a' será cambiado por 'A' .
  Utilita las funciones map y/o filter y/o foldRight

Puedes utlizar la funcion "replace" en String.*//*2.. Implementa la funcion "ex2" que recibe una lista de palabras y retorna solo aquellas con mas de 6 caracteres.
Ademas, si contienen el caracter 'a' será cambiado por 'A' .
  Utilita las funciones map y/o filter y/o foldRight

Puedes utlizar la funcion "replace" en String.*/
object Ex2 extends scala.App{

  def ex2(list:List[String]):List[String]=list.filter(_.length>6).map(_.replace('a','A'))

  println(ex2(List("pedropicacodico","tapmola","ipono","pocomas","pene")))

  val l = List("resplendor", "ballarina", "onada", "cascada", "pedalada", "brisa")
  println(ex2(l))
}
