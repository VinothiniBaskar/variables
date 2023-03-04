package access.specifier;

public class LearnPublic {
	
	public String name;
	
	public void printName() {
		name="Vasanth";
		System.out.println("Name is : "+name);

	}

	public static void main(String[] args) {
		//public -->accessed the public method in current  class in same package
		LearnPublic l=new LearnPublic();
		l.printName();

	}

}
