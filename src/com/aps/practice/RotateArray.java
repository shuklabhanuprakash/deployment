package com.aps.practice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
	    rotateLeft(arr,3);
		rotateRight(arr,3);
		

	}

	private static void rotateRight(int[] arr, int num) {
		 System.out.println(Arrays.toString(arr));
		for(int i=0;i<num;i++) {
			rotateRight(arr);
		}
		 System.out.println(Arrays.toString(arr));
	}

	private static void rotateRight(int[] arr) {
           int temp=arr[arr.length-1];
           int i;
           for(i=arr.length-1;i>0;i--) {
        	
        	   arr[i]=arr[i-1];
           }
	       	arr[i]=temp;
	  
	}

	private static void rotateLeft(int[] arr, int count) {
		System.out.println(Arrays.toString(arr));
		for(int i= 0; i<count;i++) {
		          rotate(arr);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void rotate(int[] arr) {
	int temp=arr[0],i;
		for( i =0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
	}

}
