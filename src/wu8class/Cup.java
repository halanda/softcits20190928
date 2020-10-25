package wu8class;

public class Cup implements Runnable {

	@Override
	public void run() {
		
    System.out.println("开始刷杯子");
    for (int i = 1; i <=5; i++) {
		System.out.println("刷第"+i+"个杯子");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    System.out.println("刷杯结束");
	}

}
