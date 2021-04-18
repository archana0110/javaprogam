package coreJava;

import java.util.Scanner;

public class IpandExMan28 extends IpandExPerson26 implements IfFather27{
  // person class ko extends and father interface ko implement krega.
	// is class ka apna ek variable hoga jo ki salary;jisko hum initialy 0 se set krenge.
	
	int salary=0;
	public  IpandExMan28(String n, int a, int s) {
		super(n,a);
		salary=s;
		
	}
	public void task(){
		System.out.println("Earn money");
		System.out.println("salary of person is"+salary);
		
		
	}
	public static void main(System args[]) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter name");
			String name=scan.next();
			System.out.println("enter salary");
			int salary=scan.nextInt();
			System.out.println("enter age");
			int age=scan.nextInt();
			
    IpandExMan28 m = new IpandExMan28(name, age, salary);
			
			m.showPerson_details();
			m.task();
		}
	}
	
}
