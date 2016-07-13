

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
