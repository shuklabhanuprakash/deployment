package com.hackerrank.java.algo;

import java.util.Scanner;

public class FunyString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int n = 0; n < num; n++) {
			String str = sc.next();
			boolean isFunny = false;
			String reverse = reverseString(str);
			System.out.println(reverse);
			// System.out.println(reverseRecu(str));
			for (int i = 0; i < str.length() - 1; i++) {
				int diff1 = Math.abs(str.charAt(i + 1) - str.charAt(i));
				System.out.println(str.charAt(i + 1) + "-" + str.charAt(i)
						+ " >> " + diff1);
				int ascii = (int) str.charAt(i + 1);
				System.out.println(str.charAt(i + 1) + "----ascii " + ascii);
				ascii = (int) str.charAt(i);
				System.out.println(str.charAt(i) + "----ascii " + ascii);
				int diff2 = Math.abs(reverse.charAt(i + 1) - reverse.charAt(i));

				ascii = (int) reverse.charAt(i + 1);
				System.out
						.println(reverse.charAt(i + 1) + "----ascii " + ascii);
				ascii = (int) reverse.charAt(i);
				System.out.println(reverse.charAt(i) + "----ascii " + ascii);
				System.out.println(reverse.charAt(i + 1) + "-"
						+ reverse.charAt(i) + " >> " + diff2);
				if (Math.abs(diff1 - diff2) == 0) {
					isFunny = true;
				} else {
					isFunny = false;
					break;
				}
			}
			if (isFunny) {
				System.out.println("funny");
			} else {
				System.out.println("notfunny");
			}
		}

	}

	private static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		return temp;
	}

	private static String reverseRecu(String str) {
		if (str.length() == 0) {
			return str;
		}
		return str.charAt(str.length() - 1)
				+ reverseRecu(str.substring(0, str.length() - 1));
	}
}
