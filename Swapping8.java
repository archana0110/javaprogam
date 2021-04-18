package coreJava;

public class Swapping8 {
      
	public static void Swap(int num1,int num2) {
		System.out.println("variable before swapping are: a:"+num1+";b:"+num2);
		int c = num1;
		num1=num2;
		num2=c;
		System.out.println("variable after swapping are: a:"+num1+";b:"+num2);
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		Swap(a,b);
		

	}

}
