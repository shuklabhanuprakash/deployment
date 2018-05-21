import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
	static ExecutorService executerService = Executors.newFixedThreadPool(5);

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 10; i++) { MyThread mythrd = new MyThread(i +
		 * "--"); executerService.execute(mythrd);
		 * 
		 * } executerService.shutdown();
		 */

		Thread t1 = new Thread(new Mythread1(), "t1");
		Thread t2 = new Thread(new Mythread2(), "t2");
		Thread t3 = new Thread(new Mythread3(), "t3");
		Thread t4 = new Thread(new Mythread4(), "t4");
		Thread t5 = new Thread(new Mythread5(), "t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

	public static void printCount() {

		synchronized (ThreadTest.class) {
			System.out.println("INSIDE printCount");
			System.out.println("Going To Print Count For Thread "
					+ Thread.currentThread().getName());
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

class MyThread implements Runnable {
	String msg;

	MyThread(String msg) {
		this.msg = msg;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		System.out.println("-STARTED-" + Thread.currentThread().getName()
				+ ">>>" + msg);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-ENDED-" + Thread.currentThread().getName());
	}

}

class Mythread1 implements Runnable {

	@Override
	public void run() {
		ThreadTest.printCount();
	}
}

class Mythread2 implements Runnable {

	@Override
	public void run() {
		ThreadTest.printCount();
	}
}

class Mythread3 implements Runnable {

	@Override
	public void run() {
		ThreadTest.printCount();
	}
}

class Mythread4 implements Runnable {

	@Override
	public void run() {
		ThreadTest.printCount();
	}
}

class Mythread5 implements Runnable {

	@Override
	public void run() {
		ThreadTest.printCount();
	}
}