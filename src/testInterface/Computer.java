package testInterface;

public class Computer implements Usb,Hdmi {
	@Override
	public void charge () {
		System.out.println("���Գ��");
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("������ʾ");
	}
}
