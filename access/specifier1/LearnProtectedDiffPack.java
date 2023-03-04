package access.specifier1;

import access.specifier.LearnProtected;

public class LearnProtectedDiffPack extends LearnProtected {

	public static void main(String[] args) {
		
		LearnProtectedDiffPack l=new LearnProtectedDiffPack();
		//We can access the protected methods in differnt packages by inherting and import that class
		 l.printDept();
		 l.printCity();
		 
	}

}
