package com.aps.thread.concurrency.reentrantlock;

public class Job implements Runnable {

	private Printer printer = null;
	private String docName = null;

	Job(Printer printer, String docName) {
		this.printer = printer;
		this.docName = docName;
	}

	@Override
	public void run() {
		printer.printDoc(docName);
	}

}
