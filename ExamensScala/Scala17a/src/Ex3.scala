/**
  * Created by pedro on 11/23/17.
  */




object Ex3 extends scala.App {
  val lines:List[String] = List("TAP es la mejor","asignatura de TAP ", "carrera tan divertida","Creo que soy el mejor","y voy a aprobar TAP")


  val result = lines.foldLeft(0) ((x:Int,s:String)=>x+s.split(" ").filter(_.equals("TAP")).length)


  val result2 = lines.foldLeft(0) ((x:Int,s:String)=>x+s.split(" ").count(_.equals("TAP")))


  println(result)
  println(result2)

}