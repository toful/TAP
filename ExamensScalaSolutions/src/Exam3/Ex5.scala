package Exam3

/*5. Parametriza parcialmente la función del ejercicio anterior para ordenar libros.
*/


object Ex5 extends scala.App {

  val books = List(Book("Asimov","Azazel"),Book("Leguin","Dispossessed"),Book("Asimov","Foundation"))

  def ex3(list:List[Book], author:String):Int= list.count(_.author.equals(author))
  def ex3_1(list:List[Book], author:String):Int= list.filter(_.author.equals(author)).size

  val f = ex3(_:List[Book], "Asimov")
  println(ex3(books, "Asimov"))
  println(ex3_1(books, "Asimov"))
  println(f(books))
}
