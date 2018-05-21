package com.hackerrank.java.algo;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String time = "02:01:10PM";// sc.nextLine();
		int newTime = Integer.parseInt(time.split(":")[0]);
		if (time.indexOf("PM") > -1) {
			if (newTime == 12) {
				time = "" + newTime + time.substring(2, time.length() - 2);
			} else {
				newTime += 12;
				time = "" + newTime + time.substring(2, time.length() - 2);
			}
		} else {
			if (newTime == 12) {
				time = "00" + time.substring(2, time.length() - 2);
			} else {
				time = time.substring(0, time.length() - 2);
			}
		}
		System.out.println(time);
	}
}
