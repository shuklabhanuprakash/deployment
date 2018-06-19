package com.hackerrank.java;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dataTypeTest(sc, n);*/
		String str ="52365559";
		convertStringToInt(str);
		
		
		
	}

	private static void convertStringToInt(String str) {
		char c =(int)'0';
		int val=0;
		for(int i=0;i<str.length();i++) {
			
			val = val*10 + Math.abs((int)str.charAt(i) - c);
			
		}
		System.out.println(val);
		
		
	}

	private static void dataTypeTest(Scanner sc, int n) {
		for (int i = 0; i < n; i++) {
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				} else if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				} else if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
					System.out.println("* int");
					System.out.println("* long");
				} else if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
	}

}
