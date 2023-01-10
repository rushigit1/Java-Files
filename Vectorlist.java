package com.java;
import java.util.Vector;
public class Vectorlist {
	public static void main(String[] args) {
		Vector<Object>v = new Vector<Object>();
		v.add(10);
		v.add("hello");
		v.add('C');
		v.add(34.12f);
		v.add(10);
		System.out.println(v);
		v.add(125);
		System.out.println(v.get(2));
		v.remove(4);
		v.set(3, 350);
		System.out.println(v.indexOf("hello"));
		System.out.println(v.lastIndexOf(10));
		
	Vector<Object>v1=new Vector<Object>();
		v1.addAll(v);
		System.out.println(v1);
		System.out.println(v);
	}
	


}
