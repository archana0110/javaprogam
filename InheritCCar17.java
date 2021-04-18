package coreJava;

import java.util.Scanner;

public class InheritCCar17 extends InheritCVehicle16 {
	
	     String color=" ";
	     int tyres=0;
	     
	public InheritCCar17(int c, int m,String col,int ty) {
		super(c,m);
		color=col;
		tyres=ty;
	 }
	
	public void show_car_detail() {
		System.out.println("I am a car");
		System.out.println("color of car is "+ color);
		System.out.println("no. of tyres in car "+tyres);
	}
	
	public static void main(String args[]) {
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("enter cost of vehicle");
		 int cost= scan.nextInt();
		 System.out.println("enter mileage of vechicle");
		 int mileage=scan.nextInt();
		 System.out.println("enter color of vechicle");
		 String color=scan.next();
		 System.out.println("enter no. of tyres");
		 int tyres=scan.nextInt();
		 
		 InheritCCar17 c = new InheritCCar17(cost, mileage, color, tyres);
		 c.show_vehicle_detail();
		 c.show_car_detail();
	}
	}
	
	}


