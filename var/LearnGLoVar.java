package var;

public class LearnGLoVar {
	// Global variables
	// Directly we can access within the package or another package (need to import)
	public int age = 25;
	public String name = "vino";
	protected String dept = "IT";

	public void printAge() {
		System.out.println("Age is :" + age);
	}

	public void printName() {
		System.out.println("Name  is :" + name);

	}

	public void printDept() {
		System.out.println("Dept is :" + dept);

	}

	public static void main(String[] args) {
		LearnGLoVar l = new LearnGLoVar();
		l.printName();
		l.printAge();
		l.printDept();
		LearnLocalVar lc = new LearnLocalVar();
		lc.printComapany();
		System.out.println(lc.cName1);
		// we can't access the variable ,because it is declared as local variable  in the particular method
//		System.out.println(l.cName);

	}

}
