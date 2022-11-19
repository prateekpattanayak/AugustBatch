package variable;

public class Finalvariable_Example {

	//final variable

	
			final boolean value=true;
				
				
				//2nd way to creat a method
				
				void verifyValue() {
					
					System.out.println("value is :"+ value);
					
				}
				
				//final method
				
				   final void method1() {
					
				System.out.println("i am in static method");
					
				}
				
				
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					//3rd way
					
					Finalvariable_Example fve=new Finalvariable_Example();
					
					
					System.out.println(fve.value);
					
				fve.method1();
					
					fve.verifyValue();
	

	}

}
