package Exam1

object Ex5 extends scala.App{

  val books = List(Book("Asimov",56),Book("Leguin",99),Book("Orwell",23),Book("Leguin",112),Book("Leguin",12))

  def ex5[T](c:(T)=>Boolean)(op:(T,T)=>T)(value:T)(list:List[T]):T= list match{
    case Nil => value
    case x::xs => if(c(x)) op(x,ex5(c)(op)(value)(xs)) else ex5(c)(op)(value)(xs)
  }

  def odd(elem:Int)= elem%2==0
  def sum(x:Int, y:Int)= x+y
  def max(b1:Book, b2:Book)= if(b1.price>b2.price) b1 else b2

  val sumapares= ex5 (odd) (sum) (0) (_:List[Int])
  println(sumapares(List(3,6,4,5)))

  def maxAuthor(author:String, list:List[Book])= ex5 ((b:Book)=>b.name.equals(author))(max)(Book("",Int.MinValue))(list)

  println(maxAuthor("Leguin",books))
}
