package com.aps.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] arg) {

		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		long startT1 = System.nanoTime();

		for (int i = 1; i < 10000; i++) {
			arraylist.add(i);
		}
		long endT1 = System.nanoTime();

		System.out.println("ADDITION IN ArrayLIST  " + (endT1 - startT1));

		long startT2 = System.nanoTime();

		for (int i = 1; i < 10000; i++) {
			linkedList.add(i);
		}
		long endT2 = System.nanoTime();

		System.out.println("ADDITION IN LinkedList " + (endT2 - startT2));

		long startT3 = System.nanoTime();

		for (int i = 1; i < arraylist.size(); i++) {
			arraylist.get(i);
		}
		long endT3 = System.nanoTime();

		System.out.println("Retrival IN ArrayLIST  " + (endT3 - startT3));

		long startT4 = System.nanoTime();

		for (int i = 1; i < linkedList.size(); i++) {
			linkedList.get(i);
		}
		long endT4 = System.nanoTime();

		System.out.println("Retrival IN LinkedList " + (endT4 - startT4));

		
		
		long startT5 = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			linkedList.add(i,(int)(long)(Math.random()));
			linkedList.remove(i);
			
			//linkedList.add((int)(long)(Math.random()));
		}
		long endT5 = System.nanoTime();
		System.out.println("Frequent insert and delete IN LinkedList " + (endT5 - startT5));
		
		
		long startT6 = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			arraylist.add(i,(int)(long)(Math.random()));
			arraylist.remove(i);
			
			//arraylist.add((int)(long)(Math.random()));
		}
		long endT6 = System.nanoTime();
		System.out.println("Frequent insert and delete IN Arraylist " + (endT6 - startT6));
		
		
	}

}
