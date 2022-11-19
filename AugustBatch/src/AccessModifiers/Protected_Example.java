package AccessModifiers;

public class Protected_Example {
	
	// static variable
	
	protected static int a=10;
	
	// instance variable
	
	protected String name="saag";
	
	//default method
	
	protected void method() {
		
		System.out.println("i am in protected class method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		
		Protected_Example pe=new Protected_Example();
		
		System.out.println(pe.name);
		
		pe.method();
	}

}
