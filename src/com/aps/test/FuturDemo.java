package com.aps.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FuturDemo {
	public static final ExecutorService service = Executors
			.newFixedThreadPool(2);

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		FutureTest test = new FutureTest(5);
		// System.out.println(test.fact(5));/
		System.out.println("Submitting task ...");
		Future future = service.submit(test);
		System.out.println("Task submitted...");

		if (!future.isDone()) {
			System.out.println("In PRogress");
			Thread.sleep(500);
		}
		Long fact = (Long) future.get();
		System.out.println("Factorial :-- " + fact);
		service.shutdown();

	}
}

class FutureTest implements Callable<Long> {
	long val;

	FutureTest(long val) {
		this.val = val;
	}

	@Override
	public Long call() throws Exception {
		return fact(val);
	}

	public Long fact(long a) {
		long num = 1;
		if (a < 0) {
			throw new IllegalArgumentException("Wrong value");
		}

		while (a > 0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num *= a;
			a--;
		}
		return num;
	}
}
