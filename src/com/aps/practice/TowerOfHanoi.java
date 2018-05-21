package com.aps.practice;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF DISCS");
		int noOFDisc = sc.nextInt();
		 doRecursion(noOFDisc, "A", "B", "C");
		String endingString = "ABC";
		permutString("", endingString);

		//System.out.println(fact(5));
	}

	private static int fact(int i) {
		if (i == 1) {
			return 1;
		} else {
			return fact(i - 1) * i;
		}

	}

	/**
	 *
	 */
	private static void permutString(String start, String endingString) {
		if (endingString.length() <= 1) {
			System.out.println(start + endingString);
		} else {
			for (int i = 0; i < endingString.length(); i++) {
				String newString = endingString.substring(0, i)
						+ endingString.substring(i + 1);
				permutString(start + endingString.charAt(i), newString);
			}
		}
	}

	private static void doRecursion(int n, String start, String mid, String end) {
		if (n == 1) {
			System.out.println("MOVE DISC 1 FROM " + start + " To " + end);
		} else {
			doRecursion(n - 1, start, end, mid);
			System.out.println("MOVE DISC " + n + " FROM " + start + " To "
					+ end);
			doRecursion(n - 1, mid, start, end);
		}
	}

}
