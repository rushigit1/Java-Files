package com.java;

public class TestEncapsulation2 {

	public static void main(String[] args) {
		
		employee2 e = new employee2();
		
		e.setEmpid(635);
		e.setEmpname("Raj");
		e.setEmpadress("Mumbai");
		e.setEmpsallary(7236);
		
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpadress());
		System.out.println(e.getEmpsallary());
		
	}
	
}
