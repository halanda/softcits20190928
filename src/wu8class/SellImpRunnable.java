package wu8class;

public class SellImpRunnable implements Runnable {
	private int num = 100;

	@Override
	public void run() {
		//Thread.currentThread().getName() ��ǰ�̵߳�����
    while (num >= 1) {
		System.out.println(Thread.currentThread().getName()+ "��������" + num +"��Ʊ");
		num--;
	}
	}


}
