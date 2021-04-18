package coreJava;

public class Swapping7 {
	
	
	public static void swapFunction(int a,int b) {
		System.out.println("Before Swapping a="+a+";b"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping a="+a+";b="+b);
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		swapFunction(a,b);

	}

}
