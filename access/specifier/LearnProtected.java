package access.specifier;

public class LearnProtected {
	protected String dept="IT";
	protected  String  city="Trichy";
	
	protected void printDept() {
		System.out.println("Dept is :"+dept);

	}
	
	protected void printCity() {
		System.out.println("City is :"+city);

	}

	public static void main(String[] args) {
		LearnProtected lp=new LearnProtected();
		lp.printDept();

	}
	
}
