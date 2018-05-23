package com.hackerearth.general;

import java.util.Scanner;

public class TrainMateProblem {

	public static void main(String[] args) {

		System.out.println("Enter seat no.");

		Scanner sc = new Scanner(System.in);

		int seatNo = sc.nextInt();

		findMate(seatNo);

	}

	private static void findMate(int seatNo) {
		int remainder = seatNo % 8;

		switch (remainder) {
		case 0: {
			System.out.println("SL " + (seatNo - 1));
			break;
		}
		case 1: {
			System.out.println("SL " + (seatNo + 3));
			break;
		}
		case 2: {
			System.out.println("SL " + (seatNo + 3));
			break;
		}
		case 3: {
			System.out.println("SL " + (seatNo + 3));
			break;
		}
		case 4: {
			System.out.println("SL " + (seatNo - 3));
			break;
		}
		case 5: {
			System.out.println("SL " + (seatNo - 3));
			break;
		}
		case 6: {
			System.out.println("SL " + (seatNo - 3));
			break;
		}
		default: {
			System.out.println("SL " + (seatNo + 1));
			break;
		}
		}

		return;
	}

}
