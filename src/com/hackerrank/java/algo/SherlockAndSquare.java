package com.hackerrank.java.algo;

import java.util.Scanner;

public class SherlockAndSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			int count = (int) countSquares(sc.nextLong(), sc.nextLong());
			System.out.println(count);
		}

	}

	static double countSquares(long a, long b) {
		return (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
	}
}

/**
 * Scanner sc = new Scanner(System.in); int t = sc.nextInt(); for (int a = 0; a
 * < t; a++) { double first = sc.nextDouble(); double second = sc.nextDouble();
 * int count = 0; for (double i = first; i <= second; i++) { for (double j = 1;
 * j * j <= i; j++) { if (j * j == i) { count++; } } }
 * System.out.println(count);
 *
 * }
 *
 *
 */

