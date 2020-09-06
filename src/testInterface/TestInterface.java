package testInterface;

public class TestInterface {

	public static void main(String[] args) {
		Usb usb;
		usb = new Phone();
		usb.charge();
		
		Hdmi hdmi = new Computer();
		hdmi.Show();
	}
	
}
