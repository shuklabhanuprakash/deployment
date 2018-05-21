package com.hackerrank.java.algo;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int minStudent = 0;
			int onTimeStudents = 0;
			int n = in.nextInt();
			minStudent = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}

			for (int i = 0; i < a.length; i++) {
				if (a[i] < 1) {
					onTimeStudents += 1;
				}
			}
			System.out.println("onTimeStudents" + onTimeStudents);
			String isClass = onTimeStudents >= minStudent ? "NO" : "YES";
			System.out.println(isClass);

		}
	}
}
