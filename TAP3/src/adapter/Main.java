package adapter;

public class Main {

	public static void main(String[] args) {
		CigaretteLighterReceptacle carLighter = new CigaretteLighterReceptacle();
		MP3Player myPlayer = new MP3Player("SanDisk",4,new UsbToCarAdapter(carLighter));
		MP3Player myPlayer2 = new MP3Player("Sony", 4, new Usb());
		myPlayer.charge();
		myPlayer2.charge();
	}

}
