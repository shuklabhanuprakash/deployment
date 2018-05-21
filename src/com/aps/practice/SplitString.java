package com.aps.practice;

import java.util.LinkedList;
import java.util.List;

public class SplitString {
	static int a = 1111;
	static {
		a = a-- - --a;
	}

	{
		a = a++ + ++a;
	}

	public static void main(String[] args) {

		String ans = "";
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n = 2;// sc.nextInt();
		System.out.println((6 >> 1) << 1);
		if (n >= 1 && n <= 100) {
			if (n % 2 == 0) {
				if (n >= 2 && n <= 5) {
					ans = "Not Weird";
				} else if (n >= 6 && n <= 20) {
					ans = "Weird";
				} else {
					ans = "Not Weird";
				}
			} else {
				ans = "Weird";
			}
			System.out.println(ans);
		}

		/*
		 * System.out.println(a); String str = "Hi This is Bhanu";
		 * 
		 * part(str, 3);
		 */
	}

	private static void part(String str, int n) {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < str.length(); i += n) {
			list.add((str.substring(i, Math.min(str.length(), i + n))));
		}
		for (String s : list) {
			System.out.println(s);
		}

	}

}
