package com.java;

import java.util.HashSet;
import java.util.Set;

public class hashset {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(23);
		set.add("java");
		set.add('c');
		set.add(24);
		set.add("hello");
		set.add(23);
		
		System.out.println(set);
		
		set.contains(24);
		System.out.println(set.isEmpty());
		set.remove(23);
		System.out.println(set.size());
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
		
	}

}
