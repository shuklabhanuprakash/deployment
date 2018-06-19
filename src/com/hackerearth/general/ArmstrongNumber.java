package com.hackerearth.general;

public class ArmstrongNumber {

	public static void main(String[] args) {
	 
		checkArmsStrong(153);

	}

	private static void checkArmsStrong(int n) {
		
		String str = String.valueOf(n);
		int num=0;
		for(int i =0;i<str.length();i++) {
			int t=Integer.parseInt(String.valueOf(str.charAt(i)));
			num += t*t*t;
			
		}
		System.out.println(num);
		if(num == n) {
			System.out.println(n+"is armstrong number");
		}else {
			System.out.println(n+" is not armstrong number");
		}
		
		
	}

}
