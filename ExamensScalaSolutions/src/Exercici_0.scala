
object Exercici_0 extends scala.App {

  def plusIf(c:String, a:String)= if(c.equals(a)) 1 else 0
  def ex(list:List[String], char:String) = list.filter(_.startsWith(char)).flatMap(_.toList).filter(elem => elem.equals(char.charAt(0))).length

  println(ex(List("hola", "hhhh", "pene", "he"), "h"))
}
