package com.aps.practice;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			throw new ArithmeticException();
		}/*
		 * catch (ArithmeticException e) { throw new NullPointerException(); }
		 */finally {

			throw new NullPointerException();

		}

	}
}
