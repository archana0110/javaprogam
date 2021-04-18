package coreJava;

import java.util.Scanner;

public class MLInheritGrandChild20 extends MultilevelInheritChild19 {
	
	
	String gender=" ";
	public MLInheritGrandChild20(String n,int a,String g) {
	super(n,a);
	gender= g;
	}
	 public void show_gender() {
		   System.out.println("age is "+gender);
}

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter your name:");
			String name=scan.next();
			System.out.println("enter your Gender:");
			String person_gender=scan.next();
			System.out.println("enter your age:");
			int person_age=scan.nextInt();

			MLInheritGrandChild20 gc = new MLInheritGrandChild20(name, person_age, person_gender);
			gc.show_age();
			gc.show_parent();
			gc.show_gender();
		}
	    
	}

}
