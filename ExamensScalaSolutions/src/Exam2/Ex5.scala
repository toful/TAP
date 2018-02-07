/*5. Convertir la funcion mapfilter a Curry y mostrar un ejemplo de parametrización parcial.*/

object Ex5 extends scala.App {

  def mapfilter[T](f1:(T=>T))(f2:(T=>Boolean))(list: List[T]):List[T]=list match{
    case Nil => Nil
    case head::tail => if(f2(head)) f1(head)::mapfilter(f1)(f2)(tail) else mapfilter(f1)(f2)(tail)
  }

  val l = List(1,2,3,4,5,6)


  def greater(x:Int)= x>4
  def incr(x:Int)=x+1

  val mapfilterparam=mapfilter(incr)(greater)(_)

  println(mapfilterparam(l))
}
