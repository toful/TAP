/**
  * Created by pedro on 11/23/17.
  */



object Ex1 extends scala.App {


  val number = List(1,2,3,4)


  def toNum(list:List[Int]):Double = list match {
    case Nil => 0
    case x::xs => x*scala.math.pow(10,list.length)+toNum(xs)
  }

  def toNum2(list:List[Int]):Double = {
    def accumf(list:List[Int],accum:Double):Double = list match {
      case Nil=> accum
      case x::xs => accumf(xs,x*scala.math.pow(10,list.length)+accum)
    }
    accumf(list,0)
  }





  println(toNum(number))

  println(toNum2(number))




}
