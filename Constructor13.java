package coreJava;

import java.util.Scanner;

public class Constructor13 {
//const. is a special type method jiska name class k name pe depended hai.
	  String name=" ";
	  int marks=0;
	  public  Constructor13(String a,int n) {
		  name = a;
		  marks= n;
	  }
	  public void showDetail(){
		  
		  System.out.println("Name of Student is:"+name);
		  System.out.println("marks of Student are:"+ marks);
	  
	  }
	  
	public static void main(String args[]) {
		

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your name:");
			String name = sc.next();
			System.out.println("enter your marks");
			int marks = sc.nextInt();
			
			Constructor13 c = new Constructor13(name,marks);
			c.showDetail();
		}

	}

}
