package access.specifier;

public class LearnDefault {
	int a = 100;

	void printValue() {
		System.out.println("Value is :" + a);

	}

	public static void main(String[] args) {
		//current class
		LearnDefault d=new LearnDefault();
		d.printValue();

	}

}
