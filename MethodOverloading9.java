 package coreJava;

public class MethodOverloading9 {
     // function with same name but different parameters and return types.
	
	public static int area(int n1,int n2) {
		int result= n1*n2;
		return result;
	}
	
	public static float area(float n) {
		float result= 3.14f*n*n;
		return result;
	}
	
	public static void main(String[] args) {

		int l=10;
		int w =50;
		float r=2.5f;
		
		int rectangle_area =area(l,w);
		float circle_area=area(r);
		
		System.out.println("Area of Rectangle is:  "+rectangle_area);
		System.out.println("Area of circle is:  "+circle_area);
		

	}

}
