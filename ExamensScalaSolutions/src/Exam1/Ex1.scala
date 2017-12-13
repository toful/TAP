package Exam1

object Ex1 extends scala.App{

  def replace[T](list: List[T],value1:T,value2:T):List[T] ={
    def replaceAcc[T](list: List[T],value1:T,value2:T, acc:List[T]):List[T] = list match{
      case Nil => acc
      case head::tail => replaceAcc(tail, value1, value2, if(head.equals(value1)) value2::acc else head::acc)
    }
    replaceAcc(list,value1,value2,List[T]()).reverse
  }
  println(replace(List(2,1,2,3,4,3,5,5,6,1,2,3), 3, 30))

}
