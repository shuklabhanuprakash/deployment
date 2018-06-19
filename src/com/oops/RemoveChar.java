package com.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveChar {

	public static void main(String[] args) {

		Queue<Object> list1 = new PriorityQueue<Object>();
		list1.add(new A());
		list1.add(new A());
		System.out.println(list1);
		// System.out.println(replaceChar("Bhanaaua", 'a', 'z'));
		int[] ar = new int[] { 1, 2, 3, 3, 6, 7, 4, 1, 2, 5, 6, 7, 4 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		// List<Integer> l2 = new ArrayList<Integer>();
		for (int i : ar) {

			if (!map.containsKey(i)) {
				map.put(i, -1);
			}
			
		}
		// list.addAll(l2);
		System.out.println(map);

	}

	private static String replaceChar(String string, char c, char d) {
		String returnVal = "";
		char[] a = string.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c) {
				a[i] = d;
				// returnVal +=
			}
			returnVal += a[i];
		}

		return returnVal;

	}
}

class Ani {
}

class V extends Ani {
}

class C extends V {
}