package Exam1

object Ex3 extends scala.App{
  val books = List(Book("Asimov",56),Book("Leguin",99),Book("Orwell",23))

  def max(b1:Book, b2:Book)= if(b1.price>b2.price) b1 else b2

  def ex3(list:List[Book]):String = list.foldRight (Book("", Int.MinValue)) (max).name


  def ex3_1(list:List[Book]):String = list.maxBy(_.price).name

  println(ex3(books))
  println(ex3_1(books))


}
