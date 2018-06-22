package com.hackerearth.general;

public class ArmstrongNumber {

	public static void main(String[] args) {
	 
		checkArmsStrong(370);
		checkArmsStrongInt(370);

	}

	private static void checkArmsStrongInt(int num) {
		int sum =0;
		int i = num;
		while(i > 0) {
			 int remain = i%10;
			 sum +=remain*remain*remain;
			 i = i/10;
		  
		}
		
		if(sum == num)
		System.out.println(sum);
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
