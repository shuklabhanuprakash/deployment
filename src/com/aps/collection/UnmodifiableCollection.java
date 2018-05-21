package com.aps.collection;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UnmodifiableCollection {

	public static void main(String[] args) {

		final List<String> list = new CopyOnWriteArrayList<String>();
		list.add("3");
		list.add("2");
		list.add("1");

		Collections.sort(list);

		final List<String> modifiableList = new CopyOnWriteArrayList<String>();
		modifiableList.add("E");
		modifiableList.add("F");
		modifiableList.add("G");
		modifiableList.add("A");
		modifiableList.add("B");
		modifiableList.add("C");
		modifiableList.add("D");
		System.out.println(modifiableList);
		Collections.sort(modifiableList);
		/*
		 * List<String> unModifiableList = Collections .unmodifiableList(new
		 * ArrayList(modifiableList));
		 */
		// unModifiableList.add("H");

		// System.out.println(unModifiableList);

		System.out.println(modifiableList);
		// System.out.println(unModifiableList);

	}
}
