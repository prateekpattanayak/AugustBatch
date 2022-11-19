package variable;

public class Localvariable_Example {
	
	//method
	
	//1st way to creat a method
	
	public void verifyInteger() {
		
		//local variable
		
		int number=100;
		
		System.out.println("number is :"+number);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		
		System.out.println(a);
		
		
		//syntax: classname classvariable=new classname();
		
		Localvariable_Example lve=new Localvariable_Example();
		
	lve.verifyInteger();
		
		
		
	}


}
