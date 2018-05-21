package com.hackerrank.java.algo;

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		int choco = 0;
		int wrapper = 0;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			choco = n / c;
			wrapper = choco;
			while (wrapper >= m) {
				choco += wrapper / m;
				wrapper = wrapper / m + wrapper % m;
			}
			System.out.println(choco);
		}

	}
}
