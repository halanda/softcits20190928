package testInterface;

public class Phone implements Usb,Hdmi{

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ���ʾ");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ����");
	}

}
