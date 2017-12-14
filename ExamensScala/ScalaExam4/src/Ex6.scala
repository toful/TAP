

/**
 * Created by pedro on 27/11/15.
 */

/**
 * Created by pedro on 11/26/15.
 */


trait Observer {
  def update(value:Int)
}

trait Observable {
  var observers:List[Observer] = Nil
  def addObserver(o:Observer):Unit = observers = o::observers
  def notifyAll(value:Int):Unit = observers.foreach((o:Observer)=>o.update(value))
}

class Subject(var state:Int) extends Observable{
  def setValue(newValue:Int):Unit = {
    state = newValue
    notifyAll(newValue)
  }
}

class OctalObserver extends Observer {
  override def update(value:Int):Unit= println(Integer.toOctalString(value))
}

class BinaryObserver extends Observer {
  override def update(value:Int):Unit= println(Integer.toBinaryString(value))
}


object Ex6 extends scala.App{
  val s = new Subject(888)
  s.addObserver(new OctalObserver())
  s.addObserver(new BinaryObserver())
  s.setValue(45)
  println(s.state)

}

