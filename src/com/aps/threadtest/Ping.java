package com.aps.threadtest;

import java.util.List;

public class Ping extends Thread {
	List<Integer> capacity;
	int MAX_CAPACITY;

	public Ping(List<Integer> capacity, int MAX_CAPACITY) {
		this.capacity = capacity;
		this.MAX_CAPACITY = MAX_CAPACITY;
	}

	@Override
	public void run() {
		int counter = 0;
		try {
			while (true) {
				printPing(counter++);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printPing(int counter) throws InterruptedException {
		synchronized (capacity) {
			if (capacity.size() == MAX_CAPACITY) {
				capacity.wait();
			}
			Thread.sleep(1000);
			capacity.add(counter);
			System.out.println("PING");
			capacity.notifyAll();
		}

	}
}
