/**
 * Created by pedro on 25/11/15.
 */



object Ex2 extends scala.App {



  def  replace[T] (l1:List[T],l2:List[T],value:T)= l1.map((elem:T)=>if (l2.contains(elem)) value else elem)


  println (replace(List(1,2,3,4,5,6,7),List(3,5,7),666))




}