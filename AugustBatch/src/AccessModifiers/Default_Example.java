package AccessModifiers;

public class Default_Example {
	
	//default static variable
	
	static int a=10;
	
	//default instance variable
	
	String name="saag";
	
	//default method
	
	void method() {
		
		System.out.println("i am in default class name method");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		
		Default_Example de=new Default_Example();
		
		System.out.println(de.name);
		
		de.method();
		
		
		
		
		
	}

}
