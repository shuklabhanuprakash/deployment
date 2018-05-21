package com.aps.practice;

public class Add {

	public static void main(String[] args) {

		String a = "abc";
		String b = a;
		System.out.println(b);
		System.out.println(a == b);
		new Add().getStringCheck(a);
		/*
		 * String literal = "test"; String a = new String(literal); String b =
		 * new String(literal); String x = literal; String y = literal;
		 * System.out.println(literal); System.out.println(a + "a==b" + a == b);
		 * System.out.println(b + "b==x" + (b == x) + "b==y" + (b == y));
		 * System.out.println(x + "x===y" + x == y); System.out.println(y ==
		 * literal);
		 */

		/*
		 * String a = "abc"; String b = a; a = a.toUpperCase();
		 * System.out.println(b); System.out.println(a); String a1 = new
		 * String("nn"); String a2 = a1; a1 = a1.toUpperCase();
		 * System.out.println("0000000000000000"); System.out.println(a2);
		 * System.out.println(a1);
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a ");
		 * int a = sc.nextInt(); System.out.println("Enter b"); int b =
		 * sc.nextInt(); while (b != 0) {
		 *
		 * int carry = a & b; a = a ^ b; b = carry << 1;
		 *
		 * } System.out.println(a);
		 */

	}

	private void getStringCheck(String a) {
		String b = "abc";
		System.out.println(b == a);

	}

}
