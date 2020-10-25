package wu8class;

public class SellImpRunnable implements Runnable {
	private int num = 100;

	@Override
	public void run() {
		//Thread.currentThread().getName() 当前线程的名字
    while (num >= 1) {
		System.out.println(Thread.currentThread().getName()+ "正在卖第" + num +"张票");
		num--;
	}
	}


}
