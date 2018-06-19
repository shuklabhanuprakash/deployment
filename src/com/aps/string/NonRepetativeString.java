package com.aps.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepetativeString {

	public static void main(String[] args) {
		String str = "sojsxjABCAABBCsxcZDD";
		// System.out.println(getNonRepetativeCharater(str));
		// getNonRepetativeFromSet(str);
		getNonRepetaticCharacterUsingFor("XABLAB");

	}

	static void getNonRepetativeFromSet(String st) {
		char[] carr = new char[st.length()];
		Set<Character> set = new HashSet<Character>();
		Set<Character> set2 = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			char first = st.charAt(i);
			set2.add(first);
			for (int j = st.length() - 1; j > i; j--) {

				if (first == st.charAt(j)) {

					System.out.println(first);
					set.add(first);
					break;
				}
			}

		}
		System.out.println(set2);
		System.out.println(set);
		set2.removeAll(set);
		System.out.println(set2);
		for (Character ch : set2) {
			System.out.println(ch);
			break;
		}

	}

	static void getNonRepetaticCharacterUsingFor(String st) {
		int i = 0;
		int found = 0;
		while (i < st.length()) {

			for (int j = 0; j < st.length(); j++) {
				if (st.charAt(i) == st.charAt(j)) {
					found++;
					if (found > 1) {
						found = 0;
						break;
					}
				}

			}
			if (found == 1) {
				System.out.println(st.charAt(i));
				break;
			}
			i++;

		}

	}

	/**
	 * @param str
	 * @throws Exception
	 */
	public static String getNonRepetativeCharater(String str) {
		String nonRepeatingChar = "";
		if (null != str && !str.isEmpty()) {
			str = str.trim();
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for (Character c : str.toCharArray()) {
				map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
			}
			for (Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 1) {
					nonRepeatingChar = entry.getKey().toString();
					break;
				}

			}

		}
		return nonRepeatingChar;
	}
}
