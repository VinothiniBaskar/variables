package access.specifier;

public class LearnPrivate {
	//We can access the private variable in the current class only
	private int age=25;
	
	//We can access the private method in current class only 
	private void printAge() {
		System.out.println("Age is :"+age);

	}

	public static void main(String[] args) {
		LearnPrivate lp=new LearnPrivate();
		lp.printAge();

	}

}
