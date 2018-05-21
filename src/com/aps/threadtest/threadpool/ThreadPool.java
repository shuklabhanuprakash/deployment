package com.aps.threadtest.threadpool;


public class ThreadPool implements Runnable {
	String threadName;

	ThreadPool(String name) {
		threadName = name;
	}

	@Override
	public void run() {
		System.out.println("Thread " + threadName
				+ " is going to sleep for a second ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counting();
	}

	private synchronized void counting() {
		System.out.println(threadName + " started counting ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
