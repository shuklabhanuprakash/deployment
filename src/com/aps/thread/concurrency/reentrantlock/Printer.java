package com.aps.thread.concurrency.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {

	private final Lock lock = new ReentrantLock();

	public void printDoc(String docName) {
		lock.lock();
		System.out.println(Thread.currentThread().getName()
				+ " is going to print the doc " + docName);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName()
					+ " has printed the doc " + docName);
			lock.unlock();
		}

	}

}
