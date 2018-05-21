package com.aps.threadtest.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			executor.execute(new ThreadPool(" A " + i));
		}
		executor.shutdown();
		if (executor.isShutdown()) {
			System.out.println("I'm Done");
		}

	}
}
