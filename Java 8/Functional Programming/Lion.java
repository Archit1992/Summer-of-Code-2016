/**************************************************************
* Author    : Archit, Gajjar
* Date      : 14, July 2016
* Time      : 1:15 Am(IST)
* IDE       : Notepad++
* Version   : Java 8 
**************************************************************/

@FunctionalInterface
interface hello{
	boolean first();
}
class Lion {
	public static void main(String[] args){
		System.out.println("This is Lambda expression example");
		hello h1 = ()->{return true;};
		System.out.println(h1.first());	
	}
}
