package var;

public class LearnStaticVar {
	//Static variable
	static int i;
	static String city;

	//Global variable
	int j;

	// Start of static block
	static {
		
		// We can't access instance/global variable in static block
		// j=30;
		System.out.println("Static block is called");

	}
	// End of static block

	
	// Start of static method
	public static void staticMethod() {
		// We can't access instance/global variable in static method
		// j=30;
		i = 60;
		city = "Trichy";
		System.out.println("Static method i value is :" + i);
		System.out.println("Static method city is :" + city);
		
	}
	// End of static method

	
	// Start of normal method
	public void normaMethod() {
		// static variable accessed in normal method
		i = 50;
		//static variable accessed in normal method
		city="Bangalore";
		// instance variable
		j = 40;
		System.out.println("Static variable value in normal method i is " + i);
		System.out.println("Static variable value in normal method j is " + city);
		System.out.println("instance variable value in normal method j is " + j);
		//can access the static method
		staticMethod();
	}
	// End of normal method

	
	public static void main(String[] args) {
		
		LearnStaticVar ls = new LearnStaticVar();
		// access the normal method
		ls.normaMethod();
		//access the instance variable by using  object
		System.out.println("Instance varibale value is :"+ls.j);
		
		// we can access the static varibale by using classname
		System.out.println("i value is :" + LearnStaticVar.i);
		System.out.println("City name is :" + LearnStaticVar.city);
		//access the static method by using classname
		LearnStaticVar.staticMethod();

		// we can directly access the static variable without  creating an
		// object
		System.out.println("i value is :"+i);
		System.out.println("city name is :"+city);

		// We can't access the global/instance variable without creating an object
		// System.out.println(j);
		
	}


}
