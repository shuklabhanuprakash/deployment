package com.hackerrank.java.algo;

import java.util.Scanner;

public class StairCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		int length = 4;//in.nextInt();
		
		
		//stair(length);
		stairCase(length);
	}

	private static void stairCase(int length) {

		for(int i = 1;i <=length;i++) {
			for (int j = 1; j <= length; j++) {
				if (j > (length - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			for(int j=1; j<=i;j++) {
				
				System.out.print("*");
				
				
			}
			System.out.println();

		}
		
	}

	private static void stair(int length) {
		if (length > 0) {
			for (int i = 1; i <= length; i++) {
				for (int j = 1; j <= length; j++) {
					if (j > (length - i)) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
	}
}
