package com.aps.practice;

import java.util.Scanner;

import com.aps.test.StackExchange;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER WORD");
		String word = sc.next();
		String reversed = "";
		StackExchange stack = new StackExchange(word.length());
		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
		for (int j = 0; j < word.length(); j++) {
			reversed += stack.pop();
		}
		System.out.println(reversed);

	}
}
