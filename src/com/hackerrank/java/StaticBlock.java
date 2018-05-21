package com.hackerrank.java;

import java.util.Scanner;

public class StaticBlock {
	static boolean flag = false;
	static int B = 0, H = 0;
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
			if (B > 0 && H > 0) {
				flag = true;
			} else {
				System.out
						.println("java.lang.Exception: Breadth and height must be positive");
			}
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
