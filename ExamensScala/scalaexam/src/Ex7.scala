/**
  * Created by pedrotgn on 22/11/2016.
  */



/**
  * Created by pedro on 11/26/15.
  */



trait Usb2{
  def getPower = 1
}


trait CigaretteLighterReceptacle2{
  def getEnergy = 2
}


class MP3Player2(brand: String, storageCapacity: Int, var batteryLevel: Int=0, batteryChargerInterface: Usb2){
  def charge(){
    println("--- Batt\npublicery level before: "+batteryLevel+" ---");
    batteryLevel = batteryLevel + batteryChargerInterface.getPower;
    println("--- Battery level after: "+batteryLevel+" ---");
  }
}

class ClassAdapter extends CigaretteLighterReceptacle2 with Usb2{
  override def getPower = getEnergy
}



object Ex7 extends scala.App{
  val carLighter = new CigaretteLighterReceptacle2() with Usb2
  val myPlayer = new MP3Player2("SanDisk",4,0,carLighter)
  myPlayer.charge();

  val myPlayer2 = new MP3Player2("SanDisk",4,0,new ClassAdapter)
  myPlayer2.charge();



}

