package com.tyss.mycollection.common;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionImpl {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		System.out.println(collection);
		System.out.println(" ---- add ------------");
		collection.add(10);
//		collection.add("name");
		collection.add(20);
		collection.add(30);
		System.out.println(collection);

		Collection<Integer> c = new ArrayList<Integer>();
		c.add(40);
		c.add(50);
		c.add(60);
		System.out.println(c);
		System.out.println(collection);
		collection.addAll(c);
		System.out.println(collection);

		System.out.println("------------ remove -------------");
		collection.remove(10);
		System.out.println(collection);
		collection.removeAll(c);
		System.out.println(collection);

		System.out.println(" ---- contains & conatinsAll ");

		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> c2 = new ArrayList<Integer>();

		c1.add(10);
		c1.add(20);
		c1.add(30);

		c2.add(20);
		c2.add(10);
		c2.add(30);

		System.out.println(c1.contains(40));
		System.out.println(c1.contains(20));

		System.out.println(c1.containsAll(c2));

		System.out.println(" ----------- retainAll ----------------");

		Collection<Integer> c3 = new ArrayList<Integer>();
		Collection<Integer> c4 = new ArrayList<Integer>();

		c3.add(10);
		c3.add(20);
		c3.add(30);

		c4.add(20);
		c4.add(10);

		System.out.println(c3.retainAll(c4));
		System.out.println(c3);
		System.out.println(c4);

		System.out.println(c3.isEmpty());

		Object[] arr = c3.toArray();
		
		for (Object object : arr) {
			System.out.println(object);
		}

	}
}
