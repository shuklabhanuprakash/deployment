package com.aps.test;

import java.util.Arrays;

public class SameDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 7, 1, 4, 9, 8, 5 };

		/*
		 * for (int i = 0; i < 12; i++) { if (i == 8) { break; }
		 * System.out.print(i); }
		 */
		//getHigherNumber(arr);
		 System.out.println(getGreatorNumber(arr));
	}

	private static String getGreatorNumber(int[] arr) {
		int index = -1;
		int min = 99999999;
		int switchIndex = -1;
		String output = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i - 1] < arr[i] && i > 0) {
				index = i - 1;

				for (int j = index + 1; j < arr.length; j++) {
					int diff = arr[j] - arr[index];
					if (diff > min & diff > 0) {
						min = diff;
						switchIndex = j;
					}
				}

				int temp = arr[index];
				arr[index] = arr[switchIndex];
				arr[switchIndex] = arr[index];

				for (int k = 0; k <= index; k++) {
					output += "" + arr[k];
				}
				for (int k = arr.length - 1; k > index; k--) {
					output += "" + arr[k];
				}
				break;
			}
		}

		if (index == -1) {
			return output;
		} else {
			return Arrays.toString(arr);
		}
	}

	static void getHigherNumber(int[] a) {
		int index = 0;
		int[] temp = new int[a.length];
		label: for (int i = a.length - 1; i >= 0; i--) {

			for (int j = i - 1; j >= 0; j--) {
				if (a[j] < a[i]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
					System.arraycopy(a, j, temp, j, a.length - j);
					Arrays.sort(temp);
					System.arraycopy(a, 0, temp, 0, j);
					System.out.println(Arrays.toString(temp));
					break label;
				}

			}
		}

		/*
		 * for (int i = arr.length - 1; i > 0; i--) { if (arr[i - 1] < arr[i]) {
		 * arr[i - 1] = arr[i - 1] + arr[i]; arr[i] = arr[i - 1] - arr[i]; arr[i
		 * - 1] = arr[i - 1] - arr[i]; System.out.println(i); index = i - 1;
		 * break; } }
		 * 
		 * if (index > 0) { System.out.println("after " + (index) + "index ");
		 * int size = arr.length - (index + 1); int[] temp = new int[size];
		 * 
		 * for (int j = index + 1; j < arr.length; j++) {
		 * System.out.print(arr[j]); int i = 0; temp[i] = arr[j]; //
		 * Arrays.sort(arr); i++; }
		 * 
		 * System.out.println(Arrays.toString(temp)); } //
		 * System.out.println(Arrays.toString(arr));
		 */
	}

	private static void swap(int i, int j) {
		System.out.println("BEFORE SWAP");
		System.out.print("i= " + i + " j= " + j);
		System.out.println(" After swap ");
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.print("i= " + i + " j= " + j);
		System.out.println();

	}

}
