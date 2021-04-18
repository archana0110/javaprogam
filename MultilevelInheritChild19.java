package coreJava;

public class MultilevelInheritChild19 extends MultilevelnheritParent18 {
	
		   int age=0;
		   
		   public MultilevelInheritChild19(String n, int a) {
			   super(n);
			   age=a;
			   
		   }
		   public void show_age() {
			   System.out.println("age is "+age);
		   }
		}


