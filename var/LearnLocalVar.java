package var;

public class LearnLocalVar {
	// static variable access in within the class or another class or another
	// package(need to import)
	// For accessing this variable no need to create an object directly we can use
	// the classname
	public static String cName1 = "Testleaf";

	public static String city;

	public void printComapany() {
		// Local variable is accessed only within the particular method
		// We can't access in main method or another class or other package
		String cName = "Elpis";
		System.out.println("Company Name is :" + cName);

	}

	// no need to create an object for accessing the static method
	public static void code() {
		System.out.println("Static method body is executed");
	}

	static {
		city = "Trichy";
		System.out.println("Static block" + city);
	}

	public static void main(String[] args) {

		LearnLocalVar l = new LearnLocalVar();
		l.printComapany();
		// access the method by using classname
		LearnLocalVar.code();
		// access the variable by using classname
		System.out.println(LearnLocalVar.cName1);
		// we can't access the variable ,because it is declared as local variable in the
		// particular method
//		System.out.println(l.cName);
		System.out.println(LearnLocalVar.city);
	}

}
