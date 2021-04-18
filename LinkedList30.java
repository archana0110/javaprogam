package coreJava;


import java.util.LinkedList;

public class LinkedList30 {

	public static void main(String[] args) {
		//Linked list internally uses a doubly linked list and provides methods to work with it.
		// an array list is a resizable array that grows as additional elements are added. 
		// a linked list is doubly linked list/ queue implementation.

		LinkedList<String> color = new LinkedList<String>();
	    color.add("red");
	    color.add("green");
	    color.add("blue");
	    color.add("orange");
	   System.out.println(color);
	    
	//1    color.addFirst("purple");    adding First 
	//1    System.out.println(color);
	    
	//2    color.addLast("yellow");   adding last
	 //2   System.out.println(color);
	      
	 /* 3  color.removeFirst();
	    System.out.println(color);     remove first
	    color.removeLast();
	    System.out.println(color);      remove last*/
	    
	    
	}

}
