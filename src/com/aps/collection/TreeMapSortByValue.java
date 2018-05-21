package com.aps.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapSortByValue {

	public static void main(String[] args) {

		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(88, "B");
		treemap.put(99, "A");
		treemap.put(77, "C");
		treemap.put(66, "D");
		treemap.put(55, "X");
		treemap.put(57, "X");
		System.out.println(treemap);

		Iterator it = treemap.entrySet().iterator();
		while (it.hasNext()) {
			Entry e = (Entry) it.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		List list = new ArrayList(treemap.entrySet());
		/*
		 * Collections.sort(list, new Comparator() {
		 *
		 * @Override public int compare(Object obj1, Object obj2) { return
		 * ((Comparable) ((Map.Entry) (obj1)).getValue
		 *
		 * ()).compareTo(((Map.Entry) (obj2)).getValue()); } });
		 */

		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {

				// TODO Auto-generated method stub
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		System.out.println(list);
		Map<Integer, String> sortedMap = new TreeMap(
				new ComparatorByValue<Integer, String>(treemap));

		sortedMap.putAll(treemap);
		System.out.println(sortedMap);
		// Iterator iter = myIterator(treemap);
		// while (iter.hasNext()) {
		// System.out.println(iter.next());
		// }
	}

	static Iterator myIterator(Map<Integer, String> map) {
		@SuppressWarnings("unchecked")
		Set set = new TreeSet(new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1,
					Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue()) > 0 ? 1 : -1;
			}

		});

		set.addAll(map.entrySet());
		return set.iterator();
	}

}
