/**
  * Created by pedro on 11/23/17.
  */

object Ex2 extends scala.App {


  val lines:List[String] = List("TAP es la mejor","asignatura de esta ", "carrera tan divertida","Creo que soy el mejor","y voy a aprobar TAP")



  def countWords(word:String,list:List[String]):Int = list.flatMap(_.split(" ")).filter(_.equals(word)).length


  println(countWords("TAP",lines))


  val countTAP = countWords("TAP",_:List[String])

  println(countTAP(lines))





}