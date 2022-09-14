package com.velocity.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("arraylist");
		set.add("linkedlist");
		set.add("hashset");
		set.add("linkedhashset");
		set.add("treeset");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
