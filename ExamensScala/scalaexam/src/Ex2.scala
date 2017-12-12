/**
 * Created by pedro on 25/11/15.
 */



object Ex2 extends scala.App {


  val l = List("resplendor", "ballarina", "onada", "cascada", "pedalada", "brisa")

  println(ex2(l))


  def ex2(list:List[String]):List[String]={
    val l2 = list.filter(_.length>6)
    l2.map(_.replace('a','A'))
  }




}