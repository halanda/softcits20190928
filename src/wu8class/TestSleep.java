package wu8class;

public class TestSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("��ʼ����");
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("���߽���");
	}

}
