package Exam3

/*3.  Escribe una función que calcule el numero de libros de un autor de la lista. Puedes usar las funciones sobre listas (map, ...)
*/

case class Book(author:String,title:String)

object Ex3 extends scala.App {

  val books = List(Book("Asimov","Azazel"),Book("Leguin","Dispossessed"),Book("Asimov","Foundation"))

  def ex3(list:List[Book], author:String):Int= list.count(_.author.equals(author))
  def ex3_1(list:List[Book], author:String):Int= list.filter(_.author.equals(author)).size

  println(ex3(books, "Asimov"))
  println(ex3_1(books, "Asimov"))
}
