package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter t");
		int t = sc.nextInt();
		String s = ((Integer) t).toString();
		System.out.println(s);
		// getSeriesUsingArray(t, sc);
		// getSeriesUsingArrayList(t, sc);

	}

	private static void getSeriesUsingArrayList(int t, Scanner sc) {
		int sum = 0;
		if (t < 0 || t > 500) {
			return;
		}
		int a = 0, b = 0, n = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			list.add(sc.nextInt());
		}
		int i1 = 0, i2 = 1, i3 = 2;
		for (int p = 0; p < t; p++) {
			for (int val : list) {
				a = list.get(i1);
				b = list.get(i2);
				n = list.get(i3);
			}
			for (int y = 0; y < n; y++) {

				for (int z = 0; z <= y; z++) {
					if (z == 0) {
						sum = a + (int) Math.pow(2, z) * b;
					} else {
						sum += (int) Math.pow(2, z) * b;
					}
				}
				System.out.print(sum + " ");
			}
			System.out.println();
			i1 = i1 + 3;
			i2 = i2 + 3;
			i3 = i3 + 3;
		}

	}

	/**
	 *
	 */
	private static void getSeriesUsingArray(int t, Scanner sc) {

		Integer[] a = new Integer[t];
		Integer[] b = new Integer[t];
		Integer[] n = new Integer[t];
		if (t < 0 || t > 500) {
			return;
		}
		for (int k = 0; k < t; k++) {

			a[k] = sc.nextInt();
			b[k] = sc.nextInt();
			n[k] = sc.nextInt();
		}
		Integer sum = 0;
		for (int i = 0; i < t; i++) {

			for (int j = 0; j < n[i]; j++) {
				for (int x = 0; x <= j; x++) {
					if (x == 0) {
						sum = a[i] + (int) (Math.pow(2, x) * b[i]);
					} else {
						sum += (int) (Math.pow(2, x) * b[i]);
					}
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
