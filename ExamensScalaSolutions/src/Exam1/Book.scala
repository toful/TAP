package Exam1

/*3.  Implementa la funcion "ex3" que dada una lista de Libros retorna el titulo del libro mas caro
Implementa dos versiones de ex3, una con foldRight sobre la lista de Libros.

val books = List(Book("Asimov",56),Book("Leguin",99),Book("Orwell",23))
println(ex3(books))*/
case class Book(val name:String, val price:Int)
