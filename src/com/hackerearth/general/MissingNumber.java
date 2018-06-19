package com.hackerearth.general;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		Integer b[] = { 0, 0, 1, 2, 3, 4, 5, 1, 6, 6 };
		findMissing(a);
		// findDuplicate(b);
	//	findDuplicate2(b);
		repitition(b);
	}

	private static void repitition(Integer[] b) {

		int[] c = removeduplicates(b);
		System.out.println(Arrays.toString(b));
		
		for (int i = 0; i < c.length; i++) {
			int count = 0;

			for (int j = 0; j < b.length; j++) {

				if (c[i] == b[j]) {
					count++;
				}
			}

			System.out.println(c[i]+" occurs "+count+" times");

		}

	}

	private static int[] removeduplicates(Integer[] b) {
		
		Set<Integer> set = new HashSet<>(Arrays.asList(b));
		
		System.out.println(set);
		int[] c = new int[set.size()];
		int counter =0;
		for(int d: set) {
			c[counter++] = d;
			
		}
		
		return c;
	}

	private static void findDuplicate(int[] b) {
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			if ((i + 1) < b.length && b[i] == b[i + 1]) {
				System.out.println(b[i]);
				return;
			}

		}

	}

	private static void findDuplicate2(int[] b) {
		for (int i = 0; i < b.length; i++) {
			int found = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[i] == b[j]) {
					found++;

					if (found > 1) {
						break;
					}
				}

			}
			if (found == 2) {
				System.out.println(b[i]);
				break;
			}

		}

	}

	private static void findMissing(int[] a) {
		int numbers = a.length;
		int sum = (numbers + 1) * (numbers + 2) / 2;
		int arraysum = 0;
		for (int i = 0; i < a.length; i++) {
			arraysum += a[i];
		}
		System.out.println(arraysum);
		System.out.println(sum - arraysum);

	}

}
