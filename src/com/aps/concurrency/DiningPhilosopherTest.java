package com.aps.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosopherTest extends Thread {

	public static void main(String[] args) {

		final Lock lock1 = new ReentrantLock();
		final Lock lock2 = new ReentrantLock();
		final Lock lock3 = new ReentrantLock();
		final Lock lock4 = new ReentrantLock();
		final Lock lock5 = new ReentrantLock();
		final Lock lock6 = new ReentrantLock();

		new Thread() {
			@Override
			public void run() {
				DiningPhilosopher d1 = new DiningPhilosopher(lock1, lock2,
						"ONE");
				d1.eating();
			}

		}.start();
		new Thread() {
			@Override
			public void run() {
				DiningPhilosopher d2 = new DiningPhilosopher(lock2, lock3,
						"TWO");
				d2.eating();
			}

		}.start();
		new Thread() {
			@Override
			public void run() {
				DiningPhilosopher d3 = new DiningPhilosopher(lock3, lock4,
						"THREE");
				d3.eating();
			}

		}.start();
		new Thread() {
			@Override
			public void run() {
				DiningPhilosopher d4 = new DiningPhilosopher(lock4, lock5,
						"FOUR");
				d4.eating();
			}

		}.start();

		new Thread() {
			@Override
			public void run() {
				DiningPhilosopher d5 = new DiningPhilosopher(lock5, lock6,
						"FIVE");
				d5.eating();
			}

		}.start();

	}

}

class DiningPhilosopher {
	private Lock leftFork;
	private Lock rightFork;
	private String PhilosopherName;

	DiningPhilosopher(Lock leftFork, Lock rightFork, String name) {
		this.leftFork = leftFork;
		this.rightFork = rightFork;
		this.PhilosopherName = name;
	}

	void thinking() {

		System.out.println(this.PhilosopherName + " is thinking.");
	}

	void eating() {
		thinking();
		if (leftFork.tryLock()) {

			try {
				thinking();
				if (rightFork.tryLock()) {
					try {
						Thread.sleep(4000);
						System.out.println(this.PhilosopherName + " is eating");
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						rightFork.unlock();
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				leftFork.unlock();

			}

		}

	}

}
