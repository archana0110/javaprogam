package coreJava;

import java.util.Scanner;

public class JavaOop12 {
	

	//classes- class is a template/blue print for real world entieties.
	// class in java- class is a user defined data type.
	
	//objects- objects are specific instances of a class.
	
	//Student program
	/*String name="Archana";
	int marks=65;
	public void show_details() {
		System.out.println("name of student is:"+name);
		System.out.println("marks of student are:"+marks);
	}
	
	
	
  public static void main(String args[]) {
	  
	  JavaOop12 obj = new JavaOop12();
	  obj.show_details();
  }*/
     
	//Taking Input from user 
	//Student detail
	
	String name= " ";
	int marks= 0;
	Scanner scan = new Scanner(System.in);
	 
	public void getDetails() {
		
		System.out.println("enter your name:");
		name=scan.next();
	    System.out.println("enter your marks");
		marks=scan.nextInt();
	}
	
	public void showDetails() {
		System.out.println("name of Student is "+ name);
		System.out.println("marks of student are "+ marks);
		
	}
	
	public static void main(String args[]) {
		JavaOop12 obj= new JavaOop12();
		obj.getDetails();
		obj.showDetails();
	}
	  
	
	
}
