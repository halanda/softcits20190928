package catchup_12;

public class threethread1 {
//	�������̣߳���˳���ӡ1~30��Ҫ���߳�1��ӡ1~3��Ȼ���߳�2��ӡ4~6���߳�3��ӡ7~9���߳�1��ӡ10~12���߳�2��ӡ13~15 
	public static void main(String[] args) {
		MyThread t1 = new MyThread("�߳�һ");

		MyThread t2 = new MyThread("�̶߳�");

		MyThread t3 = new MyThread("�߳���");
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
