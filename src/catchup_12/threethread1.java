package catchup_12;

public class threethread1 {
//	用三个线程，按顺序打印1~30，要求线程1打印1~3，然后线程2打印4~6，线程3打印7~9，线程1打印10~12，线程2打印13~15 
	public static void main(String[] args) {
		MyThread t1 = new MyThread("线程一");

		MyThread t2 = new MyThread("线程二");

		MyThread t3 = new MyThread("线程三");
		t1.start();
		t2.start();
		t3.start();

	}

}

class MyThread extends Thread {
	static int num = 1;
	static Object key = "key";

	public MyThread(String name) {
		super(name);
	}

	public void run() {
		while (true) {
			synchronized (key) {
				if (num <= 30)
					for (int i = 0; i < 3; i++) {
						System.out.println(getName() + ":" + num++);
					}
				else
					break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
