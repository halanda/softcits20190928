package testInterface;

public class Phone implements Usb,Hdmi{

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("手机显示");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("手机充电");
	}

}
