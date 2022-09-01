package com.java.emp;

public class Employee {
private int id;
private String firstName;
private String lastName;
private int salary;
public  String name;
public Employee(int id, String firstName,String lastName,int salary) {
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
	
}
public int getID() {
	return id;
}
public String getFirstName() {
	return firstName;
	
}
public String getLastName() {
	return lastName;
	
}
public String getName() {
	return name= firstName + lastName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary=salary;
}

public int getAnnualSalary() {
	return salary= salary*12;
	
}

public int raiseSalary(int percentage) {
	int newsal=salary+(salary*10/100);
	return newsal;
	
	
}
@Override
public String toString() {
	String e1;
	e1="ID :"  +id +" " +"NAME :" +firstName + " "+lastName+ " " +"Salary : " +salary;
	return e1;
}

}
