package com.aps.techgig;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double principle = sc.nextDouble();
		int rate = sc.nextInt();
		int year = sc.nextInt();

		System.out.println((int) Math.round(principle * rate * year / 100));

	}

}
