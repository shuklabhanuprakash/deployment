package com.aps.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentSum {

	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService executer=Executors.newFixedThreadPool(2);
		List<Future<Long>> all = executer.invokeAll(Arrays.asList(new SumTask(0, 2),new SumTask(2, 5),new SumTask(5, 7)));
		
		executer.shutdown();
		Long totalsum =0l ;
		for(Future f : all) {
		totalsum +=(Long)f.get();
				}
		System.out.println(totalsum);	
		
	}

}

class SumTask implements Callable<Long> {

	private int from, to;

	public SumTask(int from, int to) {
		this.from = from;
		this.to = to;
	}
	
	

	@Override
	public Long call() throws Exception {
		long sum = 0l;
		
		for(int i = from;i<to;i++) {
			sum +=i;
		}
		return sum;
	}
	
	
}
