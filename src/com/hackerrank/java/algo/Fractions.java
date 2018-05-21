package com.hackerrank.java.algo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fractions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double positiveNum = 0;
		double negativeNum = 0;
		double zeros = 0;
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positiveNum += 1;
			} else if (arr[i] < 0) {
				negativeNum += 1;
			} else {
				zeros += 1;
			}
		}
		System.out.println("zeros " + zeros + "positiveNum " + positiveNum
				+ "negativeNum " + negativeNum);
		System.out.println((positiveNum / n) + "\n" + (negativeNum / n) + "\n"
				+ (zeros / n));
		DecimalFormat d = new DecimalFormat(".000000");
		System.out.println(d.format(positiveNum / n) + "\n"
				+ d.format(negativeNum / n) + "\n" + d.format(zeros / n));
	}
}
