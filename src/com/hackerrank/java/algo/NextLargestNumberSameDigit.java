package com.hackerrank.java.algo;

import java.util.Arrays;

public class NextLargestNumberSameDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String str ="405321";
		findNextLargest("78485432");
		
	}

	private static void findNextLargest(String str) {
		char[] ch = str.toCharArray();
		int pos=-1;
		int diff=99999;
		int index=-1;
		String st="";
		for(int i=ch.length-1;i>=0;i-- ) {
			if((i-1)>=0 && ch[i]>ch[i-1]) {
				pos=i-1;
				break;
			}
			
		}
		if(pos == -1) {
			System.out.println("no need");
			return; 
		}
		   
		   for(int j=pos+1;j<ch.length;j++) {
			   int newDiff =Math.abs(ch[j]-ch[pos]);
			   if(newDiff <diff && ch[pos]<ch[j]) {
				   diff =newDiff;
				   index=j;
			   }
		   }
		   System.out.println(pos+"---"+Arrays.toString(ch));
		   swap(ch,pos,index);
		   System.out.println(Arrays.toString(ch));
		 for(int i = 0 ; i<=pos;i++) {
			 st +=ch[i];
		 }
		 for(int i =ch.length -1;i>pos;i--) {
			 st +=ch[i];
		 }
		   System.out.println(st);
		
		
	}

	private static void swap(char[] ch, int d1, int c) {
		char temp =ch[d1];
		ch[d1]=ch[c];
		ch[c]=temp;
		
	}

}
