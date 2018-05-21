package com.hackerrank.java.algo;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int height = 1;
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					height *= 2;
				} else {
					height += 1;
				}
			}
			System.out.println(height);

		}
	}

}
