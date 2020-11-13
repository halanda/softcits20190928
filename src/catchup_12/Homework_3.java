package catchup_12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Homework_3 {

//	有三个线程1，2，3， 其中1打印A， 2打印B，3打印C，请循环打印10次ABCABC

	// 通过JDK中的Lock锁来保证线程的访问的互斥
     public static Lock L = new ReentrantLock();

	// 通过state的值来确定是否打印
     public static int state = 0;

	static class ThreadA extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10;) {
				try {
					L.lock();

					while (state % 3 == 0) {
						System.out.println(Thread.currentThread().getName() + " -> " + "A");
						state++;
						i++;
					}
				} finally {
					// unlock()操作必须放在finally块中
					L.unlock();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	static class ThreadB extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10;) {
				try {
					L.lock();
					while (state % 3 == 1) {
						System.out.println(Thread.currentThread().getName() + " -> " + "B");
						state++;
						i++;
					}
				} finally {
					// unlock()操作必须放在finally块中
					L.unlock();
				}
			}
		}
	}

	static class ThreadC extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10;) {
				try {
					L.lock();
					while (state % 3 == 2) {
						System.out.println(Thread.currentThread().getName() + " -> " + "C");
						state++;
						i++;
					}
				} finally {
					// unlock()操作必须放在finally块中
					L.unlock();
				}

			}
		}
	}

	public static void main(String[] args) {
		new ThreadA().start();
		new ThreadB().start();
		new ThreadC().start();
	}

}