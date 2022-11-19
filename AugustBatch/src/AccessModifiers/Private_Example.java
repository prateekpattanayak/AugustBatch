package AccessModifiers;

public class Private_Example {

	//static variable 
	
	private static int a=10;
	
	//instance variable
	
	private String name="saag";
	
	private void method() {
		
		System.out.println("i am in private class name method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		
		Private_Example pe=new Private_Example();
		
		System.out.println(pe.name);
		
		pe.method();
		
		
		
	}

}
