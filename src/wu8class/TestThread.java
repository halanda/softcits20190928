package wu8class;

public class TestThread implements Runnable{

	public static void main(String[] args) {
		
		Runnable r = new TestThread();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
	    //�ڲ���
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�ڲ���run");
			}
		});
		th1.start();
		th2.start();
		th3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�����߳�ʱ�Զ�����");
	}
	
}
