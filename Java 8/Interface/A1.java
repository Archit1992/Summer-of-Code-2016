/**************************************************************
* Author    : Archit, Gajjar
* Date      : 15, July 2016
* Time      : 12:20 Pm(IST)
* IDE       : Notepad++
* Version   : Java 8
* Type      : Interface. 
**************************************************************/

interface xyz {
	public void goodBye();
	public String hi();
}
interface abc extends xyz{
	public void hello();
}
class A1 implements abc{
	
	public void hello(){
		System.out.println("Hello Archit Gajjar.");
	}
	public void goodBye(){
		System.out.println("Good bye.");
	}
	public String hi(){
		return "Hi, Archit";
	}
	public static void main(String[] args){
		//abc a1 = new abc();
		xyz x = new A1();
		abc a1 = new A1();
		
		a1.hello();
		//x.hello();							// ERROR: can't find Symbol.
		System.out.println(a1.hi());
		x.goodBye();
		// System.out.println(a1.hello());		// ERROR: void type not allowed here.
		
		// type casting...
		// A1 a = a1;							// ERROR: Not compactible.
		// A1 a = x;							// ERROR: Not compactible.
		
		
	}
}

/*
	// ERROR NOTES :	
	// abc a1 = new abc(); 			// You can not create an object of abstract abc.
	// xyz x = new A1(); 			// A1 is not compactible to the class xyz even if xyz extends abc( withoud abc extends xyz).
	// abc a1 = new A1();			// A1 is compactible to the class xyz.
	// xyz x = new A1(); 			// It will WORK if "interface abc extends xyz" and A1 class has all the methods of abc and xyz interface. 
*/