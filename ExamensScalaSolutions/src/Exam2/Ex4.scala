/*4. Implementa la funcion mapfilter que aplica la función f1 sobre los elementos de la lista que cumplen fon f2. Implementar la funcion
 con recursividad de pila y acumulativa (stack y tail recursion).
*/

object Ex4 extends scala.App {
  def mapfilter[T](f1:(T=>T), f2:(T=>Boolean), list: List[T]):List[T]=list match{
    case Nil => Nil
    case head::tail => if(f2(head)) f1(head)::mapfilter(f1,f2,tail) else mapfilter(f1,f2,tail)
  }

  def mapfilter2[T](f1:(T=>T), f2:(T=>Boolean), list: List[T]):List[T]={
    def mapfilterAcc[T](f1:(T=>T), f2:(T=>Boolean), list: List[T], acc: List[T]):List[T] = list match{
      case Nil => acc
      case x::xs => if(f2(x)) mapfilterAcc(f1, f2, xs, f1(x)::acc) else mapfilterAcc(f1, f2, xs, acc)
    }
    mapfilterAcc(f1,f2,list,List())
  }

  val l = List(1,2,3,4,5,6)


  def greater(x:Int)= x>4
  def incr(x:Int)=x+1

  println(mapfilter(incr, greater, l))
  println(mapfilter2(incr, greater, l))

}