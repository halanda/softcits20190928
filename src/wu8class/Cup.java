package wu8class;

public class Cup implements Runnable {

	@Override
	public void run() {
		
    System.out.println("��ʼˢ����");
    for (int i = 1; i <=5; i++) {
		System.out.println("ˢ��"+i+"������");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    System.out.println("ˢ������");
	}

}
