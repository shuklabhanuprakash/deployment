package com.aps.string;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		String str = "ABC";
		// permutate(str.toCharArray(), 0);
		secondMethodPermutate("", str);
	}

	private static void permutate(char[] charArray, int pos) {

		if (pos == charArray.length) {
			print(charArray);
			return;
		}

		for (int i = pos; i < charArray.length; i++) {

			swap(charArray, pos, i);
			permutate(charArray, pos + 1);
			swap(charArray, pos, i);
		}

	}

	private static void print(char[] charArray) {
		String str = "";
		for (int i = 0; i < charArray.length; i++) {
			str += charArray[i];
		}
		System.out.println(str);
	}

	private static void swap(char[] charArray, int pos, int i) {
		char temp = charArray[pos];
		charArray[pos] = charArray[i];
		charArray[i] = temp;
	}

	public static void secondMethodPermutate(String output, String input) {

		if (input.length() == 0) {
			System.out.println(output + input);
		} else {
			for (int i = 0; i < input.length(); i++) {

				secondMethodPermutate(output + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}

	}

}
