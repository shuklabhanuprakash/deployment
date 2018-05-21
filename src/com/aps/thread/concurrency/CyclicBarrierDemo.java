package com.aps.thread.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 8 }, { 4, 5, 6, 9 },
				{ 7, 8, 9, 7 }, { 6, 7, 3, 2 }, { 5, 5, 6 } };
		new MatrixSum().sumMatrix(matrix);
	}
}

class MatrixSum {
	static int[][] matrix;
	CyclicBarrier barrier;
	List<Integer> list = new ArrayList<Integer>();

	public void sumOfRow(int start) {
		int sum = 0;
		for (int i = 0; i < matrix[start].length; i++) {
			sum += matrix[start][i];
		}
		list.add(sum);
		System.out.println("SUM OF ROW " + sum);
	}

	public void sumMatrix(int[][] matrixInput) {
		matrix = matrixInput;

		barrier = new CyclicBarrier(matrix.length, new Runnable() {

			@Override
			public void run() {
				int temp = 0;
				for (int i = 0; i < list.size(); i++) {
					temp += list.get(i);
				}
				System.out.println(" Sum OF MATRIX " + temp);
			}
		});

		for (int i = 0; i < matrix.length; i++) {
			new Thread(new AddHelper(i, barrier, this)).start();
		}

	}

}

class AddHelper implements Runnable {
	int N;
	CyclicBarrier barrier;
	MatrixSum obj;

	AddHelper(int num, CyclicBarrier c, MatrixSum obj) {
		N = num;
		barrier = c;
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.sumOfRow(N);

		try {
			barrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
