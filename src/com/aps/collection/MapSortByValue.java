package com.aps.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapSortByValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("A", 5);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 1);
		map.put("F", 9);

		System.out.println(map);
		TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(new ComparatorValueSorter<String, Integer>(map));
		sorted.putAll(map);
		System.out.println(sorted);

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {

				return -obj1.getValue().compareTo(obj2.getValue());
			}
		});

		System.out.println(list);

	}

}

class ComparatorValueSorter<K, V extends Comparable<V>> implements Comparator<K> {

	Map<K, V> sorted = new HashMap<K, V>();;

	ComparatorValueSorter(Map<K, V> unsortedMap) {
		sorted.putAll(unsortedMap);
	}

	@Override
	public int compare(K o1, K o2) {

		return sorted.get(o1).compareTo(sorted.get(o2));
	}

}
