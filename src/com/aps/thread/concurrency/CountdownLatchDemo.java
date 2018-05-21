package com.aps.thread.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchDemo {

	public static void main(String[] args) {
		final CountDownLatch timer = new CountDownLatch(3);
		Thread dbService = new Thread(new Service(timer, 4000), "DB Service");
		Thread ejbService = new Thread(new Service(timer, 3000), "EJB Service");
		Thread mqService = new Thread(new Service(timer, 8000), "MQ Service");

		dbService.start();
		ejbService.start();
		mqService.start();

		try {
			timer.await();
			System.out.println("ALL SERVICE IS UP");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Service implements Runnable {
	CountDownLatch timer;
	Integer TIME_TO_START;

	public Service(CountDownLatch timer, int TIME_TO_START) {
		this.timer = timer;
		this.TIME_TO_START = TIME_TO_START;
	}

	@Override
	public void run() {
		System.out.println("GOING TO START " + Thread.currentThread().getName()
				+ " service.");
		try {
			Thread.sleep(TIME_TO_START);
			System.out.println("Initializing  "
					+ Thread.currentThread().getName() + " service.");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.timer.countDown();

	}
}
