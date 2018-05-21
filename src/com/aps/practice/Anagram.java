package com.aps.practice;

import static java.lang.Math.PI;
import static java.lang.System.out;

public class Anagram {
	static int size;
	static char[] charArray;

	public static void main(String[] args) {
		out.println(PI);
		String str = "cat";
		charArray = str.toCharArray();
		size = charArray.length;

		doAnagram(size);

	}

	private static void doAnagram(int newsize) {

		if (newsize == 1) {
			return;
		}
		for (int j = 0; j < newsize; j++) {
			doAnagram(newsize - 1);
			if (newsize == 2) {
				dispaly();
			}
			rotate(newsize);
		}

	}

	private static void rotate(int newsize) {
		int pos = size - newsize;
		char temp = charArray[pos];
		for (int i = pos + 1; i < size; i++) {
			charArray[i - 1] = charArray[i];
			charArray[i] = temp;
		}
	}

	private static void dispaly() {
		System.out.println("-------------------------------");
		for (int i = 0; i < size; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();

	}
}
