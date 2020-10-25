package wu8class;

public class TestSell {

	public static void main(String[] args) {
		//模拟3个窗口买票
		Runnable r = new SellImpRunnable();
		Thread th1 = new Thread(r);
		th1.setName("窗口1");
		Thread th2 = new Thread(r,"窗口2");
		Thread th3 = new Thread(r,"窗口3");
        
		th1.start();
		th2.start();
		th3.start();
		
		//利用循环来迅速创建多个窗口
		for (int i = 4; i <= 30; i++) {
			new Thread(r,"窗口"+i).start();
		}
		
		//利用匿名内部类实现
		Thread th4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("内部类形式run");
			}
		});
		th4.start();
	}

}
