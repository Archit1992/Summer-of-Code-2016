@FunctionalInterface
interface demo{
	public void helloFunctional();
}

interface Walk{
	int sum=0;	// does compile
	static int a=10; 	// does compile
	final String name= "Archit";	// does compile 
	public final static String author="Archit Gajjar"; 	// does compile 
	
	boolean isQuadruped();
	abstract double getMaxSpeed();
	
	public default void getMyName(){
		System.out.println("This is Archit Gajjar.");
	}
	public static void getInterface(){
		System.out.println("This is Walk interface");
	}
}

interface Run extends Walk{
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}

class Tiger implements Walk{
	public boolean isQuadruped(){
		return true;
	}
	public double getMaxSpeed(){
		return 100.123;
	}
}

public class Lion extends Tiger implements Run{
	public boolean isQuadruped(){
		return true;
	}
	
	public boolean canHuntWhileRunning(){
		return true;
	}
	
	public double getMaxSpeed(){
		return 100+120;
	}

	public static void main(String[] args){
		Tiger tiger = new Tiger();
		System.out.println(tiger.getMaxSpeed());
		
		Lion lion = new Lion();
		System.out.println(lion.getMaxSpeed());
	
		/* 
		RUN TIME ERROR : ClassCastException;
		Lion lion2 = (Lion)tiger;	// gives compile time error if casting has beed done from Superclass to Subclass. 
		*/
		
		// RUN successfully. 
		Tiger tiger2= lion;	// No casting required from Superclass to the Subclass. 
		System.out.println(tiger2.getMaxSpeed());
		
		// Lion lion2 = (Lion)tiger;
		// System.out.println(lion2.getMaxSpeed());	
		
		Run run = lion;
		System.out.println("This is the object of the run interface : "+run.getMaxSpeed());
	}
}