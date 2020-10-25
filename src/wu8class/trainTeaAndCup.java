package wu8class;

public class trainTeaAndCup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Tea()).start();
		
		Runnable r = new Cup();
		new Thread(r).start();

	}

}
