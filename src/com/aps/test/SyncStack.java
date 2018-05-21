package com.aps.test;

public class SyncStack {

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		ThirdThread t3 = new ThirdThread();
		StackExchange exchange = new StackExchange(23);

		t1.start();
		exchange.printArray();
		// t2.start();
		// StackExchange.printArray();
		/*
		 * t3.start(); StackExchange.printArray();
		 */
	}

}

class FirstThread extends Thread {
	@Override
	public void run() {
		StackExchange exchange = new StackExchange(22);
		for (int i = 0; i < 100; i++) {
			exchange.push("FirstThread" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SecondThread extends Thread {
	@Override
	public void run() {
		StackExchange exchange = new StackExchange(22);
		for (int i = 0; i < 100; i++) {
			exchange.push("SECOND THREAD" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThirdThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
