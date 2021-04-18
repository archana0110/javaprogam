package coreJava;

public class JavaFunction6 {
    // Java Functions with return values  
	// Test Project
	public int add(int num1,int num2) {
		int result = num1+num2;
		return result;
	}
	
	public static void main(String[] args) {
		 
		JavaFunction6 obj= new JavaFunction6();
		int x=10;
		int y= 20;
		int get_result =obj.add(x, y);
		System.out.println(get_result);
		

	}

}
