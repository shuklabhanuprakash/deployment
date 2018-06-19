package com.aps.string;

import java.util.HashSet;
import java.util.Set;

public class AnagramCheck {

	public static void main(String[] args) {

		Set set =new HashSet<>();
		set.add("A");
		set.add(1);
		set.add(null);
		System.out.println(set);
		
		String str1 = "CAT";
		String str2 = "ACT";
		System.out.println(checkAnagram(str1, str2));

	}

	private static boolean checkAnagram(String str1, String str2) {

		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.indexOf(str2.charAt(i)) < 0) {
				return false;
			}
				
			
		}
		return true;

	}

}
