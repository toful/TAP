/**
 * Created by pedro on 13/01/16.
 */


case class Book(author:String,title:String)


object Ex3 extends scala.App {

  val books = List(Book("Asimov","Azazel"),Book("Leguin","Dispossessed"),Book("Asimov","Foundation"))


  def booksFromAuthor(authorName:String,list:List[Book]):Int = {
    books.filter(_.author==authorName).size
  }

  println(booksFromAuthor("Asimov",books))


}