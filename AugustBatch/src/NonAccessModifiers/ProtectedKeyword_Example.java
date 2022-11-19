package NonAccessModifiers;

import AccessModifiers.Protected_Example;

public class ProtectedKeyword_Example extends Protected_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way
		
ProtectedKeyword_Example pe=new ProtectedKeyword_Example();
		
		pe.method();
		
		System.out.println(pe.a);
		
		System.out.println(pe.name);
		
		//2nd way
		
		ProtectedKeyword_Example pe1=new ProtectedKeyword_Example();
		
		pe1.method();
		
	}

}
