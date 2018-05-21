package com.oops;

public class StringOperation {

	public static void main(String[] args) {
		String str = "BHANUxxcvxxvxxvxjUUPPJJKK";
		int[] a = new int[] { 1, 3, 67, 77, 88, 5, 7, 5, 8 };
		System.out.println(getSecondLargest(a));
		System.out.println(removeDuplicates(str));
		getRepetitiveCount(str);
	}

	private static int getSecondLargest(int[] a) {
		int largest = 0;
		int secondLargest = 0;
		for (int i : a) {

			if (largest < i) {
				secondLargest = largest;
				largest = i;
			} else if (secondLargest < i) {
				secondLargest = i;
			}

		}

		return secondLargest;
	}

	private static void getRepetitiveCount(String str) {
		int count = 0;
		int maxCount = 0;
		char maxRepetivechar = '\0';
		String nonDuplicate = removeDuplicates(str);
		for (int i = 0; i < nonDuplicate.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == nonDuplicate.charAt(i)) {
					count += 1;
				}

			}
			if (maxCount < count) {
				maxCount = count;
				maxRepetivechar = nonDuplicate.charAt(i);
			}
			System.out
					.println(nonDuplicate.charAt(i) + " occours for " + count);
		}
		System.out.println(maxRepetivechar + " is maximum repeated for "
				+ maxCount);
		return;
	}

	private static String removeDuplicates(String str) {
		String nonDuplicate = "";
		for (int i = 0; i < str.length(); i++) {
			if (nonDuplicate.indexOf(str.charAt(i)) == -1) {
				nonDuplicate += str.charAt(i);
			}
		}

		return nonDuplicate;
	}
}
