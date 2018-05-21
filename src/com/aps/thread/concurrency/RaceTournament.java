package com.aps.thread.concurrency;

import java.util.concurrent.CountDownLatch;

public class RaceTournament {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch timer = new CountDownLatch(4);
		new Thread(new Racer(timer, 2000), "HORSE").start();
		new Thread(new Racer(timer, 5000), "LION").start();
		new Thread(new Racer(timer, 8000), "MOUSE").start();
		new Thread(new Racer(timer, 9000), "TORTOISE").start();
		timer.await();

		System.out.println("All racers are ready for race.");
	}

}

class Racer implements Runnable {
	private final CountDownLatch timer;
	private final int timeToReady;

	public Racer(CountDownLatch timer, int timeToReady) {
		this.timer = timer;
		this.timeToReady = timeToReady;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()
				+ " is going for race");
		try {
			Thread.sleep(timeToReady);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.countDown();
		System.out.println(Thread.currentThread().getName()
				+ " is ready for race");

	}
}
