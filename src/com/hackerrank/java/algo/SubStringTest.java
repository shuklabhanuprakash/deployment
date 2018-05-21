package com.hackerrank.java.algo;

import java.util.Scanner;

public class SubStringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String input = sc.next();
			System.out.println(findSubString(input));
		}
	}

	private static int findSubString(String st) {
		int count = 0;
		String sub = "";
		if (null == st || ("" == st && st.length() == 0)) {
			return 0;
		}
		for (int i = 0; i < st.length(); i++) {
			sub = getSubString(st, i, i);
			count += 1;
			System.out.println(sub);
			sub = getSubString(st, i, i + 1);
			count += 1;
			System.out.println(sub);
		}
		return count - 1;
	}

	private static String getSubString(String st, int left, int right) {
		if (left > right) {
			return null;
		}
		while (left >= 0 && right < st.length()) {
			left--;
			right++;
		}
		return st.substring(left + 1, right);
	}
}
