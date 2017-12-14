package Exam5
/*
3. Escribe una función que calcule la media de precios de una biblioteca.

  val books = List(Book("Isaac Asimov",56),Book("Leguin",99),Book("Orwell",23))

  println(ex3(books))
  Resultado: 59
*/
case class Book (name:String, price:Int)

object Ex3 extends scala.App{

  def ex3(l:List[Book])= l.map(_.price).sum/l.length

  def ex3b(l:List[Book]) = l.map(_.price).foldRight(0) (_+_) /l.length

  val books = List(Book("Isaac Asimov",56),Book("Leguin",99),Book("Orwell",23))

  println(ex3(books))
  println(ex3b(books))
}
