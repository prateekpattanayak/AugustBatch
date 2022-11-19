package NonAccessModifiers;

public class FinalVariable_Example {
	
	//final variable
	
	final boolean value=true;
	
	//2nd way to create a method
	
	void verifyValue() {
		System.out.println("value is :" + value);
		
		
	}

	//final method
	
	final void method1() {
		
		System.out.println("i am in final method");
		
		
	}
	public static void main(String[]args) {
		FinalVariable_Example fve=new FinalVariable_Example();
		System.out.println(fve.value);
		fve.method1();
		fve.verifyValue();
		//fve.value=false;
	}
	
	
	
}
