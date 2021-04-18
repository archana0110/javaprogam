package coreJava;

import java.util.ArrayList;

public class ArrayList29 {
     // Array List is a resizable array with many useful methods to work with
	public static void main(String[] args) {
		
  /*  ArrayList<String> cars= new ArrayList<String>();
    cars.add("volvo");
    cars.add("bmw");
    cars.add("ford");
    cars.add("mazda");
    System.out.println(cars); */
		
		ArrayList<String> color = new ArrayList<String>();
	    color.add("red");
	    color.add("green");
	    color.add("blue");
	    color.add("orange");
	  //  System.out.println(color);
	//1    color.set(0, "purple");   change element values
	//1   System.out.println(color);
	 //2   color.remove(1);     remove element
	 //2   System.out.println(color);
	    
        
        System.out.println(color.get(0));  //get individual element
	}

}
