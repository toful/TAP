/*3. a) Escribe una función que calcule el nombre del autor del libro mas caro de una lista. Puedes usar las funciones sobre listas (map, ...)

    val books = List(Book("Isaac Asimov",56),Book("Leguin",99),Book("Orwell",23))
    println(ex3(books))

    b) Escribe la función del apartado a usando foldRight sobre la lista de libros.
*/

object Ex3 extends scala.App {
  val books = List(Book("Isaac Asimov",56),Book("Leguin",99),Book("Orwell",23))

  def ex3(list:List[Book]):String=list.maxBy(_.price).name

  println(ex3(books))
}

case class Book(name: String, price: Int)