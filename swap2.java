package com.first;
import java.util.Scanner;
public class swap2 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the value of a=");
	int a = sc.nextInt();
	System.out.println("enter the value of b=");
	int b = sc.nextInt();
	
	int c = a;
	a = b; 
	b = c; 
	
	System.out.println("after swapping.....");
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
