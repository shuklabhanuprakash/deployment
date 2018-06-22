package com.aps.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramCheck {

	public static void main(String[] args) {

		Set set = new HashSet<>();
		set.add("A");
		set.add(1);
		set.add(null);
		System.out.println(set);

		String str1 = "CAT";
		String str2 = "CTA";
		System.out.println(checkAnagram(str1, str2));
		System.out.println(checkAnagramWithArray(str1,str2));
	}

	private static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] ch1 = str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}

		}
		return true;

	}

	private static boolean checkAnagramWithArray(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] ch1 = str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		
	}

}
