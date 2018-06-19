package com.aps.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheTest {

	public static void main(String[] args) {
		LRUCache<String,Integer> lru = new LRUCache(15);

		for(int i=1;i<=15;i++) {
			lru.put("A"+i,i);
		}
		/*for(Map.Entry<String,Integer> entry : lru.entrySet()) {
			lru.removeEldestEntry(entry);
		}*/
		
		System.out.println(lru);
		
		for(int i=10;i<=15;i++) {
			lru.put("B"+i,i);
		}
		/*for(Map.Entry<String,Integer> entry : lru.entrySet()) {
			lru.removeEldestEntry(entry);
		}*/
		System.out.println(lru);
	//	for()
		for(int i=5;i<=10;i++) {
			lru.put("D"+i,i);
		}
		System.out.println(lru);
		
		lru.put("ZZZZZZZZZZZZ", 9999);
		System.out.println(lru);
	}

}

class LRUCache<K, V> extends LinkedHashMap<K, V> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8978099713195035669L;
	int cacheSize;

	public LRUCache(int cacheSize) {
		super(16, 0.75f, true);
		this.cacheSize = cacheSize;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size()>cacheSize;
	}

}