/**
 * Created by pedro on 11/26/15.
 */


case class Book(name:String,cost:Int)


object Ex3 extends scala.App {

  val books = List(Book("Isaac Asimov",56),Book("Leguin",99),Book("Orwell",23))

  println(ex3(books))

  println(ex3b(books))

  def ex3(books:List[Book]):String = books.maxBy(_.name.length).name


  def max(b1:Book,b2:Book)= if (b1.name.length>b2.name.length) b1 else b2

  def ex3b(books:List[Book]):String = books.foldRight (Book("",0)) (max).name


}