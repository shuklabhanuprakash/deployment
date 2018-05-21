package com.aps.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ABCD";

		System.out.println(reverse(a));
		System.out.println(reverseString(a));
	}

	static String reverse = "";

	/**
	 * @param a
	 * @return
	 */
	private static String reverse(String a) {
		if (a.length() == 0) {
			return "";
		}

		return a.charAt(a.length() - 1)
				+ reverse(a.substring(0, a.length() - 1));

	}

	public static String reverseString(String str) {
		String a = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			a += str.charAt(i);
		}
		return a;
	}

}
