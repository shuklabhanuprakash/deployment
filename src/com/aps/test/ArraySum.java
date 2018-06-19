package com.aps.test;

import java.util.Scanner;

/**
 * @author bhanu.shukla
 *
 */
public class ArraySum {

	public static void main(String[] args) {

		//findDuplicate("AVBPSHNMDJFNC");
		
		//findDuplicateTwoString("AVBSHNMDJFNC","LDKEPEM");
		findNonDuplicate("NMDJFNCMD");
		/*int[] arr = { 4, 3, 8, 5, 4, 7, 10, 1 };
		System.out.println("ENTER NUMBER");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		findSumUsingBrutForce(arr, number);*/

	}

	private static void findNonDuplicate(String s) {
		int found=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					found++;
				}
				if(found > 1) {
					found =0;
					break;
				}
				
			}
			if(found ==1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

	static void findSumUsingBrutForce(int[] a, int num) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == num) {
					System.out.println(num + " is the sum of " + a[i] + " and "
							+ a[j] + " numbers.");
				}
			}
		}

	}
	
	static void findDuplicate(String s) {
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
					return;
				}
				
			}
			
		}
		
	}
	
	
static void findDuplicateTwoString(String s,String t) {
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<t.length();j++) {
				if(s.charAt(i)==t.charAt(j)) {
					System.out.println(s.charAt(i));
					return;
				}
				
			}
			
		}
		
	}
	
	

}
