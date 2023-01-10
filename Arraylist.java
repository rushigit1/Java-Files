package com.java;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
ArrayList<Object> Al = new ArrayList<Object>();

Al.add(10);
Al.add("Hello");
Al.add('C');
Al.add(23.24f);
Al.add(10);
System.out.println(Al);
Al.add(45);
System.out.println(Al.get(2));
Al.remove(3);
Al.set(4, 34);
System.out.println(Al.indexOf(34));
System.out.println(Al.lastIndexOf(45));
ArrayList<Object> Al1 = new ArrayList<Object>();

Al1.addAll(Al);
System.out.println(Al);
System.out.println(Al1);
	}}
