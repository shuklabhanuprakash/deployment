package com.aps.practice;

public class CalPolindrom {

	public static void main(String[] args) {

		String str = "12211221";// "damadamamadamad";
		// countPalimdrom(str);
		highestPalindrom(str);
	}

	private static void highestPalindrom(String str) {
		String highest = "";
		if (str.isEmpty()) {
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String palindrom = getCountPalindrome(str, i, i);
			highest = checkHighest(palindrom, highest);
			palindrom = getCountPalindrome(str, i, i + 1);
			highest = checkHighest(palindrom, highest);
		}
		System.out.println(highest);

	}

	private static String checkHighest(String palindrom, String highest) {
		if (highest.length() < palindrom.length()) {
			highest = palindrom;
		}

		return highest;
	}

	private static void countPalimdrom(String str) {
		if (str.isEmpty()) {
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String palindrom = getCountPalindrome(str, i, i);
			if (palindrom.length() > 1) {
				System.out.println("  -----            " + palindrom);
			}
			palindrom = getCountPalindrome(str, i, i + 1);
			if (palindrom.length() > 1) {
				System.out.println("  =            " + palindrom);
			}
		}

	}

	private static String getCountPalindrome(String str, int left, int right) {

		if (left > right) {
			return null;
		}
		while (left >= 0 && right < str.length()
				&& str.charAt(left) == str.charAt(right)) {

			left--;
			right++;

		}

		return str.substring(left + 1, right);
	}
}
