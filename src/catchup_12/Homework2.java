package catchup_12;

public class Homework2 {
	 
	    //flag==true时，打印数字；
	    boolean flag = true;
	    //要打印数字的起始数
	    int num = 1;
	 
	 
	    public synchronized void printNumber() throws InterruptedException {
	 
	        if (flag==false) {
	            this.wait();
	        }
	        for (int i = 0; i < 1; i++) {
	            System.out.print(num++);
	        }
	        flag = false;
	        this.notify();
	    }
	 
	    public synchronized void printChar(int i) throws InterruptedException {
	        if (flag) {
	            this.wait();
	        }
	        System.out.print((char)('a' + i ));
	        flag = true;
	        this.notify();
	    }

public static void main(String[] args){
	Homework2 print = new Homework2();
    new Thread(new Runnable() {
        @Override
        public void run() {
                for(int i =0;i<26;i++){
                    try{
                        print.printNumber();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
            }
        }
    }).start();

    new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i =0;i<26;i++){
                try{
                    print.printChar(i);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }).start();

}
}
