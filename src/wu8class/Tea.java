package wu8class;

public class Tea implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("¿ªÊ¼Æã²è");
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Æã²è½áÊø");
	}

}
