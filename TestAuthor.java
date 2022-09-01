package com.test.auth;

public class TestAuthor {
public static void main(String[] args) {
		
		Author a1 = new Author();
		Author a2 = new Author("SAHIL ","KUMAR");
		Author a3 = new Author("SAHIL ","KUMAR","Sprit nature");
		System.out.println(a1);
		//getters in obj2
		System.out.println("*********************************************************************");
		System.out.println("FIRST NAME "+a2.getFirstName());
		System.out.println("SECOND NAME "+a2.getLastName());
		System.out.println("BOOK NAME "+a2.getBookName());
		System.out.println("*********************************************************************");
		//getters in obj3
		System.out.println("INFORMATIN :"+a3.toString());
		
		//getters in obj1
		System.out.println("*********************************************************************");
		System.out.println("FIRST NAME "+a1.getFirstName());
		System.out.println("SECOND NAME "+a1.getLastName());
		System.out.println("BOOK NAME "+a1.getBookName());
		System.out.println("*********************************************************************");	
				
		
		Author a4= new Author();//new object
		System.out.println(a4);
		Author a5;//refrence
		a5=new Author();
		System.out.println("INFORMATION :"+a5.toString());
		
		

}
}