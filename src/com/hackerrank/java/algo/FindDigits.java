package com.hackerrank.java.algo;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int temp = n;
			int count = 0;
			while (n > 0) {
				int r = n % 10;
				n = n / 10;
				if (r > 0 && temp % r == 0) {
					count += 1;
				}
			}
			System.out.println(count);
		}

	}

}
