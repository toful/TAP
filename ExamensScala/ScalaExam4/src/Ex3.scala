/**
 * Created by pedro on 11/26/15.
 */


case class Book(name:String,cost:Int)


object Ex3 extends scala.App {

  val books = List(Book("Isaac Asimov",56),Book("Leguin",99),Book("Orwell",23))

  println(ex3(books))


  def ex3(books:List[Book]):Int = (books.map(_.cost).foldRight (0) (_+_))/books.length




}