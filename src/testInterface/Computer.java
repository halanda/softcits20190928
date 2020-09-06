package testInterface;

public class Computer implements Usb,Hdmi {
	@Override
	public void charge () {
		System.out.println("电脑充电");
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("电脑显示");
	}
	public void Web() {
		System.out.println("电脑上网");
	}
	
}
