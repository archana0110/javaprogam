package coreJava;

public class FlowControlSt3 {

	public static void main(String[] args) {
   // if statement is used to test the condition. 
// the java if statement tests the condition.It executes the if block if condition is true.
		
	//	int age =20;
	//	if(age>18) {
	//		System.out.println("Age is greater than 18");
	//	}
      
	// the java if-else statement also tests the conditon. It executes the if block if condition is true otherwise else block is executed.
		
	//	int x=20;
	//	int y=18;
	//	if(y>x) { 
		//	System.out.println("y is greater than x");
	//	}else {
	//		System.out.println("x is greater than y");
	//	}
		
		
  // The if-else-if ladder statement executes one condition from multiple statements.
	/*int marks=65;
		if(marks<50){
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){
			System.out.println("D Grade");
		}
		else if(marks>=60 && marks<70){
			System.out.println("C Grade");
		}
	    else if(marks>=70 && marks<80) {
				System.out.println("B Grade");
	    }
		 else if(marks>=80 && marks<90) {
				System.out.println("A Grade");
		 }
		 else if(marks>=90 && marks<100) {
				System.out.println("A+ Grade");
		 }
		 else {
			 System.out.println("invalid");
			}*/
		// example2
		/*int number=-13;
		if(number>0) {
			System.out.println("positive");
		}
		else if(number<0) {
			System.out.println("negative");
		}  
		else {
			System.out.println("zero");
		}*/
		
		// The nested if ststement represents the if block within another if block. here, the innerif block condition executes only when outer if block condition is true.
		
		int age=20;
		int weight=80;
		if(age>=18) {
			if(weight>50) {
				System.out.println("you are eligible to donate blood");
			}
		}
		
	
		}
		
	}
		
		


