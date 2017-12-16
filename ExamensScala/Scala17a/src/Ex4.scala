import scala.io.Source

object Ex4 extends scala.App {


  val src = Source.fromFile("hola.txt")
  val lines = src.getLines().map(_.split(" ").toList).toList
  src.close()

  println(lines)




  def countWord(word:String,list:List[List[String]]):Int = {
    lines.map(_.count(_.equals(word))).sum
  }

  println(countWord("TAP",lines))



}