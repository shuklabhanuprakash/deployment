package com.aps.collection;

public class Average6 {
	public static void main(String[] args) {
		System.out.println("Average: " + printAverage(100, 0));
		System.out.println("Exit main().");
	}

	public static int printAverage(int totalSum, int totalNumber) {
		int average = 0;
		try { // (3)
			average = computeAverage(totalSum, totalNumber);
			System.out.println("Average = " + totalSum + " / " + totalNumber
					+ " = " + average);
			return average;
		} finally {
			System.out.println("Finally done.");
			return average * 2;
		}
	}

	public static int computeAverage(int sum, int number) {
		System.out.println("Computing average."); // (9)
		return sum / number; // (10)
	}
}