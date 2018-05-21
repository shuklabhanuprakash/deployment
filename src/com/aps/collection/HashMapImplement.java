/**
 *
 */
package com.aps.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bhanu.shukla
 *
 */
public class HashMapImplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.putIfAbsent("A", "AKKI");
		map.putIfAbsent("B", "BHANU");
		map.putIfAbsent("A", "MAHATWA");
		System.out.println(map);
		// testMap();

		// testList();

		// testConcurrentMod();

	}

	/**
	 *
	 */
	private static void testConcurrentMod() {
		// Map<String, String> map = new ConcurrentHashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, null);
		map.put(null, null);
		map.put(null, null);
		map.put("f", "f");
		System.out.println(map);
		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		l1.add("F");
		l1.add("G");
		l1.remove("H");
		System.out.println(l1);
		int size = l1.size();
		for (int i = 0; i < size; i++) {
			// l1.remove(5);

			/*
			 * if (i == l1.size() - 1) { l1.add(i++, "GHUSS"); ; }
			 */
			if (i == 4) {
			}
		}

		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.equals("C")) {
				it.remove();
			}
		}
		System.out.println(l1);
	}

	/**
	 *
	 */
	private static void testList() {
		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		l1.add("F");
		l1.add("G");
		List<String> uL = Collections.unmodifiableList(l1);

		System.out.println(l1);
		System.out.println(uL);

		l1.add("H");
		System.out.println(uL);

		List<String> unm = Collections.unmodifiableList(new ArrayList(l1));
		l1.add("BBB");
		l1.add("XXXXXXXXXXX");
		System.out.println(l1);

		List<String> asList = Arrays.asList("wed", "thurs", "sun", "mon");
		// asList.add("FRI");// immutable list
		asList.set(1, "GHUSS");
		System.out.println(asList);
		String[] arr = { "QQ", "WW", "EE", "RR" };
		List<String> asList2 = new ArrayList<String>(Arrays.asList(arr));
		asList2.add("TT");
		System.out.println(asList2);
	}

	/**
	 *
	 */
	private static void testMap() {
		Student stu = new Student(1, "Bhanfu");
		Student stu2 = new Student(1, "Bhadnu");
		Student stu3 = new Student(1, "Bhafnu");
		System.out.println(stu.toString());
		System.out.println(Integer.toHexString(1));

		Map<Student, String> map = new HashMap<Student, String>();
		map.put(stu, "ABC");
		map.put(stu2, "DEF");
		map.put(stu3, "ERFT");
		System.out.println(map.get(stu));
		System.out.println(map.get(stu2));
		System.out.println(map.get(stu3));

		Set<Student> set = map.keySet();
		Iterator it = set.iterator();
		Iterator it2 = (Iterator) map.entrySet().iterator();
		System.out.println("ENTRY SET STARTS");
		while (it2.hasNext()) {

			Entry et = (Entry) it2.next();
			System.out.println(et.getKey());
			System.out.println(et.getValue());
		}
		System.out.println("ENTRY SET End");

		while (it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		System.out.println("*********************************");
		for (Student st : set) {
			System.out.println(st);
			System.out.println(map.get(st));
		}

		System.out.println("===================================");
	}
}
