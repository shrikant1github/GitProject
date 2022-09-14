package com.velocity.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lkhs = new LinkedHashSet<Integer>();
		lkhs.add(10);
		lkhs.add(11);
		lkhs.add(12);
		lkhs.add(13);
		lkhs.add(14);
		
		Iterator<Integer> itr = lkhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
