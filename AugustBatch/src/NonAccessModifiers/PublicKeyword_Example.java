package NonAccessModifiers;


import AccessModifiers.Public_Example;

public class PublicKeyword_Example extends Public_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicKeyword_Example pe=new PublicKeyword_Example ();
		
		pe.method();
		
		System.out.println(pe.a);
		
		System.out.println(pe.name);
		
		
		//2nd way
		
		Public_Example pe1=new Public_Example();
		
		pe1.method();
		
		System.out.println(pe1.a);
	
		System.out.println(pe1.name);
	}
}
