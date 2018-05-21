package com.aps.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparatorByValue<K, V extends Comparable<V>> implements
		Comparator<K> {

	Map<K, V> map = new HashMap<K, V>();

	ComparatorByValue(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public int compare(K k1, K k2) {

		return -map.get(k2).compareTo(map.get(k1)) > 0 ? 1 : -1;
	}

}
