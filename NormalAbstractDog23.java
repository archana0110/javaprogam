package coreJava;

public class NormalAbstractDog23 extends  AbstractAnimal21{
	//@override
	public void animal_sound() {
		System.out.println("Bow Bow");
		
	}
    public static void main(String args[]) {
    	
    	NormalAbstractCat22 c = new NormalAbstractCat22();
    	c.animal_sound();
    	NormalAbstractDog23 d = new NormalAbstractDog23();
    	d.animal_sound(); 
    }
}
