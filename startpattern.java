package com.java;

public class startpattern
{
	public static void main(String[] args) 
	{
	    int n=5;
		int i;
		int j;
		for (i=0; i<=n; i++)
	 {
			for(j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
