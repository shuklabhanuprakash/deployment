package com.aps.thread.concurrency.reentrantlock;

public class TestPrinting {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread[] t = new Thread[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("A " + i + "Document is ready ");
			t[i] = new Thread(new Job(printer, ("A " + i)), "Thread" + i);
		}
		for (int i = 0; i < 10; i++) {
			t[i].start();
		}

	}
}
