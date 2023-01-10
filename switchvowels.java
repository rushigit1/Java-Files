package com.java;
import java.util.Scanner;

public class switchvowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 1 to 5 number");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1st vowels of alfabet is a");
			break;
		case 2:
			System.out.println("2nd vowels of alfabet is e");
			break;
		case 3:
			System.out.println("3rd vowels of alfabet is i");
			break;
		case 4:
		System.out.println("4rth vowels of alfabet is o");
			break;
		case 5: 
		System.out.println("5th vowels of alfabet is u");
		break;
		default:
		System.out.println("please enter valid number");
		break;
			
		}
	}

}
