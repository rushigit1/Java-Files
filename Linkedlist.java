package com.java;
import java.util.LinkedList;
public class Linkedlist {
public static void main(String[] args) {
	LinkedList<Object>Ls = new LinkedList<Object>();
	Ls.add(10);
	Ls.add("hello");
	Ls.add('C');
	Ls.add(23.45f);
	Ls.add(10);
	System.out.println(Ls);
	Ls.add(45);
	System.out.println(Ls.get(2));
	Ls.remove(4);
	Ls.set(3, 34);
	System.out.println(Ls.indexOf(34));
	System.out.println(Ls.lastIndexOf(45));
	
	LinkedList<Object>Ls1= new LinkedList<>();
	Ls1.add(Ls);
	System.out.println(Ls1);
	System.out.println(Ls);
}
}
