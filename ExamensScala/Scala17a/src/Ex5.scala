

object Ex5 extends scala.App {


  def mapWhen[T,R](list:List[T]) (f:T=>T) (condition:T=>Boolean):List[T]= list match {
    case Nil => Nil
    case x :: xs => if (!condition(x)) x::mapWhen (xs) (f) (condition) else f(x) :: mapWhen (xs)  (f) (condition)
  }

  val l:List[Int] = List.range(1,100)

  println(mapWhen(l) ((x:Int)=>x*2) ((x:Int)=> x < 20))


  val quad = mapWhen (_:List[Int]) ((x:Int)=>x*2) ((x:Int)=> x < 20)

  println(quad (l))



  def censor(elem:String):Boolean={
    val censored = List("caca","pedo")
    censored.contains(elem)
  }

  val l2 = List("TAP", "es","una","caca","de","asignatura")
  println(mapWhen(l2) (a=>"pasada") (censor))





}
