/**
 * Created by pedro on 11/26/15.
 */



object Ex5 extends scala.App {

  val l = List(1,2,3,4,5,6)


  println(ex5 (0) (sum) (greater) (l))



  val sumodds = ex5 (0) (sum) (x=>x%2==0) _

  println(sumodds(l))


  val books = List(Book("Asimov",56),Book("Leguin",99),Book("Orwell",23),Book("Leguin",12))


  def greater(x:Int):Boolean= x>4
  def sum(x:Int,y:Int)=x+y
  def max(b1:Book,b2:Book)= if (b1.cost>b2.cost) b1 else b2

  def maxAuthor(author:String,list:List[Book]) = ex5 (Book("",0)) (max) ((b:Book)=>b.name==author) (list)

  println(maxAuthor("Leguin",books))




  def ex5[T] (result: T)  (f: (T, T) => T)  (f2:(T)=>Boolean) (xs: List[T]): T = xs match {
    case Nil => result
    case x :: xs => ex5 (if (f2(x)) f(x,result) else result) (f) (f2) (xs)
  }


}