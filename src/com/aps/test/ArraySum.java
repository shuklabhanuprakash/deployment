package com.aps.test;

import java.util.Scanner;

/**
 * @author bhanu.shukla
 *
 */
public class ArraySum {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 8, 5, 4, 7, 10, 1 };
		System.out.println("ENTER NUMBER");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		findSumUsingBrutForce(arr, number);

	}

	static void findSumUsingBrutForce(int[] a, int num) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == num) {
					System.out.println(num + " is the sum of " + a[i] + " and "
							+ a[j] + " numbers.");
				}
			}
		}

	}

}
