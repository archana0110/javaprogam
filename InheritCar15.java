package coreJava;

public class InheritCar15 extends InheritanceVehicle14{
	 
		 String color = "blue";
		 int tyres = 4;

		 public void show_car_details() {
			 System.out.println("i am a car ");
			 System.out.println("color of cars "+ color);
			 System.out.println("no. of tyres in cars "+tyres);
		 }
		 
		 public static void main(String[] args) {
				
				
				InheritCar15 c = new InheritCar15();
				c.show_car_details();
				}
	 }

