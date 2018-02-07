/**
  * Created by pedrotgn on 24/11/2016.
  */





trait Setter {
  def setValue(newValue:Int):Unit
}



trait Observer2 {
  def update(value:Int)
}

trait Observable2 {
  var observers:List[Observer2] = Nil
  def addObserver(o:Observer2):Unit = observers = o::observers
  def notifyAll(value:Int):Unit = observers.foreach((o:Observer2)=>o.update(value))
}


class Subject2(var state:Int) extends Setter{
  override def setValue(newValue:Int):Unit = state = newValue

}

trait Notify extends Setter with Observable2{
  abstract override def setValue(newValue:Int):Unit = {
      notifyAll(newValue)
      super.setValue(newValue)
  }
}

class OctalObserver2 extends Observer2 {
  override def update(value:Int):Unit= println(Integer.toOctalString(value))
}

class BinaryObserver2 extends Observer2 {
  override def update(value:Int):Unit= println(Integer.toBinaryString(value))
}



object Ex7 extends scala.App{
  val s = new Subject2(888) with Notify
  s.addObserver(new OctalObserver2())
  s.addObserver(new BinaryObserver2())
  s.setValue(45)
  println(s.state)

}
