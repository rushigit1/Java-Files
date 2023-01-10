package com.java;

public class calculator {
	public static int addition (int a, int b) {
	int c = a+b;
	return c;
	}
	public static int Substraction (int a, int b) {
		int c = a+b;
		return c;
	}
	public static long multiplication (int a, int b) {
	 int c = a*b;
	 return c;
	}
	public static int division (int a, int b) {
		int c = a/b;
		return c;
		
	}
	public static void main(String[] args) {
		int x = addition (40, 50);
		System.out.println("addition result:" + x);
		int y = Substraction (17,56);
		System.out.println(("Substraction result:" + y));
	    long z = multiplication (7878776, 67876768);
	    System.out.println(("multiplication result:" + z));
	    int b = division (65, 45);
	    System.out.println("division result:" +b);
	}
		
			 
		
	}

