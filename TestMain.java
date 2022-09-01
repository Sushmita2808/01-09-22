package com.java.emp;
public class TestMain {
	public static void main(String args[]) {
		Employee e1 = new Employee(111174," ARMAAN" ,"MALIK",200000);
		e1.toString();
		System.out.println("*********************************************************************");
		System.out.println(e1);
		System.out.println("*********************************************************************");
		System.out.println("\n");
		e1.setSalary(99999);
		
		System.out.println(e1);
		
		System.out.println("\nId is :" +e1.getID());
		System.out.println("\nFast name is:" +e1.getFirstName());
		System.out.println("\nLast name is: " + e1.getLastName());
		System.out.println("\nSalary is: " + e1.getSalary());
        System.out.println("\nName is: " + e1.getName());
		System.out.println("\nAnnual salary is: " + e1.getAnnualSalary()); 
		
		
		System.out.println("New Salary is :"+e1.raiseSalary(10));
		System.out.println(e1);
 

		
			
		}

}
