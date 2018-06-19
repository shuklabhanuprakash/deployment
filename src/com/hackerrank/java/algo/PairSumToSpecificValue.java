package com.hackerrank.java.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSumToSpecificValue {

	public static void main(String[] args) {
		int k = 15;
		int[] a = { 2, 5, 7, 8, 4, 6, 9 };
		//findPairwithBruteForce(k, a);
		//findPairwithSort(k,a);
		findPairwithMap(k,a);
	}

	private static void findPairwithMap(int k, int[] a) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(map.containsKey(k-a[i])) {
				System.out.println("pair " + a[i] + "+" + (k-a[i]) + " is " + k);
			}else {
				
				map.put(a[i],i);
			}
			
			
		}
		
}

	private static void findPairwithSort(int k, int[] a) {
		Arrays.sort(a);
		for(int i = 0 , j = a.length -1 ;i<j;) {
			
			if(a[i]+a[j] == k) {
				System.out.println("pair " + a[i] + "+" + a[j] + " is " + k);
				i++;
				j--;
			}
			else if((a[i]+a[j]) < k) {
				i++;
			}else {
				j--;
			}
			
		}
		
	}

	private static void findPairwithBruteForce(int k, int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == k) {
					System.out.println("pair " + a[i] + "+" + a[j] + " is " + k);
				}

			}

		}

	}

}
