package com.aps.techgig;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MatrixZeros {

	public static void main(String[] args) {

		findDistance();
		//String str = "azzzeeeefffmtttadd";
	//	firstNonRepetative(str);
		//firstNonRepetativeMap(str);
	}

	private static void firstNonRepetativeMap(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		long start = System.nanoTime();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}
		System.out.println(map);
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
		long end = System.nanoTime();
		System.out.println("TIME CONSUMNED IN MAP " + ((end - start)));
	}

	private static void firstNonRepetative(String str) {
		long start = System.nanoTime();
		char temp = str.charAt(0);
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != temp) {
				if (count == 1) {
					System.out.println(str.charAt(i - 1));
					break;
				} else {
					count = 1;
					temp = str.charAt(i);
				}
			} else {
				count++;
			}
		}
		long end = System.nanoTime();
		System.out.println("TIME CONSUMNED NORMAL " + ((end - start)));
	}

	/**
	 *
	 */
	private static void findDistance() {
		int[][] arr = { { 0, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };

		int x0 = 0;
		int y0 = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				int distance = Math.abs(x0 - i) + Math.abs(y0 - j);
				System.out.print("\t" + distance);

			}
			System.out.println();
		}
	}
}
