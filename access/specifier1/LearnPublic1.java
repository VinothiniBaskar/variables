package access.specifier1;

import access.specifier.LearnPublic;

public class LearnPublic1 {

	public static void main(String[] args) {
		//public -->accessed the public method in another class with different package
		//but we need to import that particular class
		LearnPublic l=new LearnPublic();
		l.printName();

	}

}
