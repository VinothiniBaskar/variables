package access.specifier;

public class LearnProtectedClass1  extends LearnProtected {

	public static void main(String[] args) {
		LearnProtected lp=new LearnProtected();
		lp.printDept();
		//We can access the protected methods in another class and same package by inherting that class
		LearnProtectedClass1 l=new LearnProtectedClass1();
		l.printCity();
		l.printDept();
	}

}
