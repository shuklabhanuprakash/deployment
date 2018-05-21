package com.aps.practice;


public class Matrix {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int sum1 = 0, sum2 = 0;
		int[][] a = { { 2, 3, 4 }, { 1, 2, 3 }, { 1, 3, 5 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j] + "  ");
				if (j == a.length - 1) {
					System.out.println();
					break;
				}
			}

		}

		for (int i = 0, j = 0; i < a.length; i++, j++) {
			sum1 += a[i][j];
		}
		System.out.println("----");
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			sum2 += a[i][j];
		}
		int diff = sum1 > sum2 ? sum1 - sum2 : sum2 - sum1;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(diff);
	}
}
