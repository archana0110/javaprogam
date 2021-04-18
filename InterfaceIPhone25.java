package coreJava;

public class InterfaceIPhone25 implements InterfacePhone24{
	    public void cost() {
	    	System.out.println("cost of IPhone is 30$");
	    }
	    public void color() {
	    	System.out.println("color of IPhone is Gold");
	    	
	    }
	    public void batterylife() {
	    	System.out.println("battery of IPhone is 22 hours");
	    }

	public static void main(String[] args) {
		InterfaceIPhone25 ip = new InterfaceIPhone25();
		ip.color();
		ip.batterylife();
		ip.cost();
	}

}
