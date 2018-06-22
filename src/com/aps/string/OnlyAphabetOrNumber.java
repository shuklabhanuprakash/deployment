package com.aps.string;

public class OnlyAphabetOrNumber {

	public static void main(String[] args) {

		String str = "klLijjhrjhjlhtjhjthtltnhltntnltn";
		onlyNumber(str);
		onlyLetters(str);
		onlyAplhaNumeric(str);
	}

	private static void onlyAplhaNumeric(String str) {
		if (str.matches("^[a-zA-Z0-9]+")) {
			System.out.println("alphanumeric");
		}		
	}

	private static void onlyLetters(String str) {
		if (str.matches("[a-zA-Z]+")) {
			System.out.println("alphabet");
		}
	}

	private static void onlyNumber(String str) {
		if (str.matches("[0-9]+")) {
			System.out.println("numeric");
		}

	}

}
