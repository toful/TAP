import Exam4.CigaretteLighterReceptacle

/*7. Implementar ahora el Class Adapter usando traits en Scala.
Si podeis demostrar el class Adapter sin crear una clase nueva tendreis puntuacion adicional.
*/
//Adaptee
trait CigaretteLighterReceptacle {
  def getEnergy = 2
}

//Target
trait Usb {
  def getPower = 1
}

//We choose an Object Adapter implementation because the Target isn't an Interface
class UsbToCarAdapter extends Usb with CigaretteLighterReceptacle {
  override def getPower: Int = getEnergy
}

//Client
class MP3Player(var brand: String, var storageCapacity: Int, var batteryChargerInterface: Usb) {
  private var batteryLevel = 0

  def charge(): Unit = {
    println(brand)
    System.out.println("--- Battery level before: " + batteryLevel + " ---")
    batteryLevel = batteryLevel + batteryChargerInterface.getPower
    System.out.println("--- Battery level after: " + batteryLevel + " ---")
  }
}

object Ex7 extends scala.App {
  val carLighter = new CigaretteLighterReceptacle with Usb
  val myPlayer = new MP3Player("SanDisk", 4, carLighter)
  val myPlayer2 = new MP3Player("Sony", 4, new UsbToCarAdapter)

  myPlayer.charge()
  myPlayer2.charge()

}