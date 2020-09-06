package testInterface;

public class TestInterface {

	public static void main(String[] args) {
		Usb usb;
		usb = new Phone();
		usb.charge();
		
//		向上造型
		Hdmi hdmi = new Computer();
		hdmi.Show();
		

//		向下造型
		Phone p = (Phone)usb;
		p.Call();
		
		Computer c = (Computer)hdmi;
		c.Web();
		
	}
	
	   
}
