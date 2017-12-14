

/**
 * Created by pedro on 11/26/15.
 */



class Usb {
  def getPower = 1
}


class CigaretteLighterReceptacle{
  def getEnergy = 2
}


class MP3Player(brand: String, storageCapacity: Int, var batteryLevel: Int=0, batteryChargerInterface: Usb){
  def charge(){
    println("--- Batt\npublicery level before: "+batteryLevel+" ---");
    batteryLevel = batteryLevel + batteryChargerInterface.getPower;
    println("--- Battery level after: "+batteryLevel+" ---");
  }
}

 class UsbToCarAdapter(carInterface:CigaretteLighterReceptacle) extends Usb{
   override def getPower = carInterface.getEnergy
}




object Ex6 extends scala.App{
  val carLighter = new CigaretteLighterReceptacle();
  val myPlayer = new MP3Player("SanDisk",4,0,new UsbToCarAdapter(carLighter))
  myPlayer.charge();

}

