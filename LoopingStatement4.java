package coreJava;

public final class LoopingStatement4 {

	public static void main(String[] args) {
		//Looping Statement are used to repeat a task multiple times.
       // A while loop statement in java programming language repeatedly executes atargetstatement as long as a given condition is true.
		/*int x=1;
		while(x<=4) {
			System.out.println(x);
			x++;
			}*/
		
		// For Loop  is used to iterate a part of the program several times.if the number of iteration is fixed, it is recommended to use for loop.
		// for(initialization;condition;incr/decr){ statement}
		 
		/*for(int i =0; i<5;i++) {
			System.out.println(i);
		}*/
		
		/*for(int i =0; i<=10; i=i+2) { 
			System.out.println(i);
		}*/
		
		//Pattern Problem
		 int n=5; 
		  for(int i=0; i<n; i++) {
			  for(int j=0; j<=i; j++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
			  }
		
		  }
		
		
	}



