package com.java;

public class dowhileloop2 {
	public static void main (String[] args) {
		String[]a= {"hello", "how", "are", "you"};
		int b = 0;
		do {
			System.out.println(a[b]);
			b++;
		
		} while (b<a.length);
	}

}
