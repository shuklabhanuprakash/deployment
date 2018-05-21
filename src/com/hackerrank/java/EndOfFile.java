package com.hackerrank.java;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int counter = 0;
		while (true) {
			String s = sc.nextLine();
			if (s == null) {
				break;
			}
			System.out.println(++counter + " " + s);
		}

	}

}
