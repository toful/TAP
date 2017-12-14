package Exam4
/*
6. Implementar el ejemplo de Adapter de TAP3 en Scala.
*/
//Adaptee
class CigaretteLighterReceptacle {
  def getEnergy = 2
}

//Target
class Usb {
  def getPower = 1
}

//We choose an Object Adapter implementation because the Target isn't an Interface
class UsbToCarAdapter(var carInterface: CigaretteLighterReceptacle) extends Usb {
  override def getPower: Int = carInterface.getEnergy
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

  def getBrand: String = brand

  def getStorageCapacity: Int = storageCapacity
}

object Ex6 extends scala.App {
    val carLighter = new CigaretteLighterReceptacle
    val myPlayer = new MP3Player("SanDisk", 4, new UsbToCarAdapter(carLighter))
    val myPlayer2 = new MP3Player("Sony", 4, new Usb)
    myPlayer.charge()
    myPlayer2.charge()
}
