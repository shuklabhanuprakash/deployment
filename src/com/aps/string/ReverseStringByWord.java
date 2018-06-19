package com.aps.string;

public class ReverseStringByWord {

	public static void main(String[] args) {
		String s = "Java technology blog for smart java concepts and coding practices";

		
		System.out.println(reverse1("Hello"));
		reverseByWord(s);

	}

	private static void reverseByWord(String s) {

		String[] str = s.split(" ");

		String newString = "";
		for (String string : str) {
			newString += reverse1(string) + " ";

		}
		System.out.println(newString);

	}

	private static String reverse1(String string) {
		if (string.length() == 0) {
			return string;
		}

		return string.charAt(string.length() - 1) + reverse1(string.substring(0, string.length() - 1));
	}

	private static String reverse(String string) {
		String res = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			res +=string.charAt(i);
		}

		return res;
	}

}
