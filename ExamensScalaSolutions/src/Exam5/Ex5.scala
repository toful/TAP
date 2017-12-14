package Exam5

/*5. Utilizad parametrizacion parcial en 4 para generar una funcion concat_lists y otra max_lists
 println (max_lists(List(1,6,4,7),List(99,23,1,5)))
 Resultado:99
 println (concat_lists(List("hola","amigo","mio"),List("aprobare","tap", "seguro")))
 Resultado: holaaprobareamigotapmioseguro
 */


object Ex5 extends scala.App{

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

  def concat(a:String, b:String) = a.concat(b)
  def max (a:Int, b:Int) = a.max(b)

  val max_lists=zipfold(_:List[Int], _:List[Int], max , Int.MinValue)
  val concat_lists=zipfold(_:List[String], _:List[String], concat, "")

  println (max_lists(List(1,6,4,7),List(99,23,1,5)))
  //Resultado:99
  println (concat_lists(List("hola","amigo","mio"),List("aprobare","tap", "seguro")))
  //Resultado: holaaprobareamigotapmioseguro
}