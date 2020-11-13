package catchup_12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Homework_3 {

//	�������߳�1��2��3�� ����1��ӡA�� 2��ӡB��3��ӡC����ѭ����ӡ10��ABCABC

	// ͨ��JDK�е�Lock������֤�̵߳ķ��ʵĻ���
     public static Lock L = new ReentrantLock();

	// ͨ��state��ֵ��ȷ���Ƿ��ӡ
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
					// unlock()�����������finally����
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
					// unlock()�����������finally����
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
					// unlock()�����������finally����
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