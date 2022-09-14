package com.velocity.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String> ();
		list.add("ramesh");
		list.add("suresh");
		list.add("naresh");
		list.add("lankesh");
		list.add("sangmesh");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	
	}

}
