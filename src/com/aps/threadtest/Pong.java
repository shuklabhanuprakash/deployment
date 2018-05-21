package com.aps.threadtest;

import java.util.List;

public class Pong extends Thread {
	List<Integer> capacity;
	int MAX_CAPACITY;

	public Pong(List<Integer> capacity, int MAX_CAPACITY) {
		this.capacity = capacity;
		this.MAX_CAPACITY = MAX_CAPACITY;
	}

	@Override
	public void run() {
		int counter = 0;
		try {
			while (true) {
				printPong(counter++);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void printPong(int counter) throws InterruptedException {
		synchronized (capacity) {
			if (capacity.isEmpty()) {
				capacity.wait();
			}
			Thread.sleep(1000);
			capacity.remove(0);
			System.out.println("PONG");
			capacity.notifyAll();
		}
	}

}
