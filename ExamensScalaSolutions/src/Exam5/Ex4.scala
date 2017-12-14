package Exam5
/*4. Implementa la funcion zipfold que se le pasan dos listas, y aplica la funcion f con elementos de las dos (zip), y despues las combina con
la misma funcion para obtener un resultado (fold). Implementar zipfold con recursividad de pila y acumlativa.

println(ex4(sum,0,List(1,2,3), List(2,3,4)))
Resultado: 15*/


object Ex4 extends scala.App{

  def sum(int: Int, int2: Int)=int+int2

  def zipfold[T](l1:List[T], l2:List[T],f:(T,T)=>T, default:T):T = (l1,l2)match{
    case(_,Nil)=> default
    case (Nil,_)=>default
    case (a::as,b::bs) => f(f(a,b),zipfold(as,bs,f,default))
  }

  def zipfold_2[T](l1:List[T], l2:List[T],f:(T,T)=>T, default:T):T ={
    def zipfold_acc[T](l1:List[T], l2:List[T],f:(T,T)=>T, acc:T):T = (l1,l2)match{
      case(_,Nil)=> acc
      case (Nil,_)=>acc
      case (a::as,b::bs) => zipfold_acc(as,bs,f,f(acc,f(a,b)))
    }
    zipfold_acc(l1,l2,f,default)
  }

  println(zipfold(List(1,2,3), List(2,3,4),sum,0))
  println(zipfold_2(List(1,2,3), List(2,3,4),sum,0))
}