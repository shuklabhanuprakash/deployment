package com.aps.practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// result += str.charAt(i);
		}
		// System.out.println(result);
		if (result.equals(str)) {
			// System.out.println("PALINDROME");
		} else {
			// System.out.println("NOT");
		}

		 //System.out.println(reverse("hello"));

		System.out.println(largestPalindrome("pbhmamadammaok"));
	}

	public static String largestPalindrome(String str) {
		String longest = str.substring(0, 1);
		for (int i = 0; i < str.length(); i++) {
			String palindrom = checkPalindrom(str, i, i);
			longest = checkLongest(longest, palindrom);
			palindrom = checkPalindrom(str, i, i + 1);
			longest = checkLongest(longest, palindrom);
		}
		if (longest.length() == 1) {
			return "";
		}
		return longest;
	}

	/**
	 * @param longest
	 * @param palindrom
	 * @return
	 */
	private static String checkLongest(String longest, String palindrom) {
		if (palindrom.length() > longest.length()) {
			longest = palindrom;
		}
		return longest;
	}

	private static String checkPalindrom(String str, int left, int right) {
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

	private static String reverse(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			return str.charAt(str.length() - 1)
					+ reverse(str.substring(0, str.length() - 1));
		}

	}

}
