package com.java;

public class ArrayDuplicate {
public static void main(String[] args) {
	int [] arr = {10,50,10,40,60,50};
	for(int i=0; i<arr.length; i++) { 
		for(int j=i+1; j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
				
		}
	}
	
}
}
