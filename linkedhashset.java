package com.java;
import java.util.LinkedHashSet;
public class linkedhashset {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		
		lhs.add(24);
		lhs.add("java");
		lhs.add(34);
		lhs.add("hello");
		lhs.add(24);
		
		System.out.println(lhs);
		
		lhs.contains(34);
		System.out.println(lhs.isEmpty());
		lhs.remove("hello");
		System.out.println(lhs.size());
		System.out.println(lhs);
		lhs.clear();
		System.out.println(lhs);
	}

}
