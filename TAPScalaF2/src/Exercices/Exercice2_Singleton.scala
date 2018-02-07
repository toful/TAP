/*Exercise 2. Implement the singleton pattern in Scala*/

class Car(val wheels: Int){
  def getWheels():Int = wheels
}

object Car{
  val car = new Car(4)

  def getInstance():Car={car}
}

object Exercice2_Singleton extends scala.App {

  val car = new Car(5)
  println("Nombre de rodes: "+car.getWheels())
  println("Nombre de rodes: "+Car.getInstance().getWheels())
}
