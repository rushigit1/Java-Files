package com.java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Testbank {public static void main(String[] args)  {

	getEmp();

}
@SuppressWarnings("resource")
public static void getEmp() {
	BankEmployee [] emp = new BankEmployee[10];
	Scanner sc = new Scanner (System.in) ;
	
	int option;

	loop: while(true) {
		System.out.println();
		System.out.println("choose a option");
		System.out.println("1.add employee information");
		System.out.println("2.show employee information");
		System.out.println("3.update employee information");
		System.out.println("4.delete employee information");
		System.out.println("5.exit");
		option = sc.nextInt();

		try {
			switch (option) {
		case 1:
			try {
			addEmp(emp);}
			catch (InputMismatchException e) {
				System.out.println("  error:"+e);
				addEmp(emp);
			}
			break;
		case 2 : 
			viewEmp(emp);
			break;
		case 3 :
			addEmp(emp);
			break;
		case 4 :
			deleteEmp(emp);
			break;
		case 5 :
			System.out.println("Exit");
			System.out.println("Thanks for visiting");
			break loop;
		default:
			System.out.println("Invalid Option");
			System.out.println("Thanks for visiting");
			break;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
@SuppressWarnings("resource")
public static void addEmp(BankEmployee [] emp) throws InputMismatchException {
	String empName;
	String city;
	int empId;
	double salary;
	int i =0;

	Scanner sc = new Scanner(System.in);

	System.out.println("1. enter employee id");
	empId = sc.nextInt();
	System.out.println("2. enter employee name");
	empName = sc.next();
	System.out.println("3. enter salary of employee");
	try {
		salary = sc.nextDouble();
	} catch (InputMismatchException e) {
		salary = sc.nextDouble();
	}
	System.out.println("4. enter employee city");
	city = sc.next();
	emp[i] = new BankEmployee(empId, empName, city, salary);
	}



public static void viewEmp(BankEmployee [] emp) {
	int x = 0;
	System.out.println("BankEmployee id :     "+emp[x].getempId());
	System.out.println("BankEmployee name :   "+emp[x].getempName());
	System.out.println("BankEmployee city :   "+emp[x].getCity());
	System.out.println("BankEmployee salary : "+emp[x].getSalary());

}

public static void deleteEmp(BankEmployee [] emp) {
	int j= 0;
	emp[j] = new BankEmployee(j, null, null, j);
	System.out.println("BankEmployee id "+emp[j].getempId());
	System.out.println("BankEmployee name"+emp[j].getempName());
	System.out.println("BankEmployee city "+emp[j].getCity());
	System.out.println("BankEmployee salary "+emp[j].getSalary());
	
     }
}

