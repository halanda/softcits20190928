package wu8class;

public class TestSell {

	public static void main(String[] args) {
		//ģ��3��������Ʊ
		Runnable r = new SellImpRunnable();
		Thread th1 = new Thread(r);
		th1.setName("����1");
		Thread th2 = new Thread(r,"����2");
		Thread th3 = new Thread(r,"����3");
        
		th1.start();
		th2.start();
		th3.start();
		
		//����ѭ����Ѹ�ٴ����������
		for (int i = 4; i <= 30; i++) {
			new Thread(r,"����"+i).start();
		}
		
		//���������ڲ���ʵ��
		Thread th4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�ڲ�����ʽrun");
			}
		});
		th4.start();
	}

}
