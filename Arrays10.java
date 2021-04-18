package coreJava;

public class Arrays10 {

	public static void main(String[] args) {
		
		//arrays helps us to store multiple elemnts of same datatypes.
	   /*	char[] a = new char[5];
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='e';
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}*/
		
	/*	int[] a = new int[10];
		for(int i=0;i<10;i++) {
			a[i]=i;
		}
			for (int i=0;i<10;i++) {
				System.out.println(a[i]);
			}*/
		
		
		//Adding Two arrays in java
		int num =5;
		int a[]= new int[5];
		int b[]= new int[5];
		int c[]= new int[5];
		for(int i =0; i<5; i++) {
			a[i]=i;
		}
		for(int i =0; i<5; i++) {
			b[i]=num;
			++num;
		}
		// array  A	
		System.out.println("values in array A:");
		for(int i =0; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		// array  B
		System.out.println("values in array B:");
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		// array c
		for(int i=0;i<5;i++) {
			c[i]=a[i]+b[i];
		}	
		
		System.out.println("values in array c:");
		for(int i=0;i<5;i++) {
			System.out.print(c[i]+ " ");
		}
		
		}
		   
	}


