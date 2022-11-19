package AccessModifiers;

public class Public_Example {
	
	// static variable
	
	public static int a=10;
	
	// instance variable
	
	public String name ="saag";
	
	//default method
	
	public void method() {
		
		System.out.println("i am in public class method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		
		Public_Example pe=new Public_Example();
		
		System.out.println(pe.name);
		
		pe.method();
	

	}

}
