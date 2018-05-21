package com.hackerrank.java;

import java.util.Scanner;

public class StdinAndStdout {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); //
		 * System.out.println("Enter String");
		 *
		 * System.out.println("Enter integer"); try { int x = sc.nextInt();
		 * System.out.println("Enter double");
		 *
		 * final double y = sc.nextDouble(); System.out.println("Enter String");
		 * sc.nextLine(); String str = sc.nextLine(); String format = ""; if (x
		 * <= 99) { if (x < 10) { format = "00" + x; } else { format = "0" + x;
		 * } x = Integer.parseInt(format); System.out.println(format);
		 *
		 * } System.out.println("String: " + str); System.out.println("Double: "
		 * + y); System.out.println("Int: " + x); } catch (Exception e) { throw
		 * new InputMismatchException("You enterted wrong data"); }
		 */
		printFormat();

	}

	public static void printFormat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		// for (int i = 0; i < 3; i++) {
		String s = sc.next();

		int v = sc.nextInt();

		System.out.format("%-12s" + "", s);
		System.out.format("%03d", v);
		// }
		System.out.println();
		System.out.println("==================================");

	}

}
