
import scala.io.Source

object Ex4b extends scala.App {


  val src = Source.fromFile("hola.txt")
  val lines = src.getLines().flatMap(_.split(" ")).toList
  src.close()

  println(lines)




  def countWord(word:String,list:List[String]):Int = {
    list.count(_.equals(word))
  }

  println(countWord("TAP",lines))



}