package wu8class;

public class TestThread implements Runnable{

	public static void main(String[] args) {
		
		Runnable r = new TestThread();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
	    //内部类
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("内部类run");
			}
		});
		th1.start();
		th2.start();
		th3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("启动线程时自动运行");
	}
	
}
