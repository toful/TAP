package Exam5

import java.util
import java.util.{ArrayList, List}

/*6. Implementar el ejemplo de Observer de TAP3 en Scala usando traits a ser posible.
  Avanzado: Conseguir modificar el subject en tiempo de ejecucion para que sea Observable de manera transparente
  usando Stackable traits. En el nuevo Subject no es necesario notificar a los observers. Se hace con traits en tiempo de ejecucion.
 */

trait Observer {
  def update(newValue: Int): Unit
}

class BinaryObserver extends Observer {
  override def update(newState: Int): Unit = {
    System.out.println("Binary String: " + Integer.toBinaryString(newState))
  }
}

class OctalObserver extends Observer {
  override def update(newState: Int): Unit = {
    System.out.println("Octal String: " + Integer.toOctalString(newState))
  }
}

class HexaObserver extends Observer {
  override def update(newState: Int): Unit = {
    System.out.println("Hex String: " + Integer.toHexString(newState).toUpperCase)
  }
}


class Subject {
  private val observers: util.List[Observer] = new util.ArrayList[Observer]
  private var state: Int = 0

  def getState: Int = state

  def setState(state: Int): Unit = {
    this.state = state
    notifyAllObservers(state)
  }

  def attach(observer: Observer): Unit = {
    observers.add(observer)
  }

  def notifyAllObservers(state: Int): Unit = {
    import scala.collection.JavaConversions._
    for (observer <- observers) {
      observer.update(state)
    }
  }
}

object Ex6 extends scala.App{
  val subject = new Subject

  subject.attach(new HexaObserver())
  subject.attach(new OctalObserver())
  subject.attach(new BinaryObserver())

  System.out.println("First state change: 15")
  subject.setState(15)
  System.out.println("\nSecond state change: 10")
  subject.setState(10)

}