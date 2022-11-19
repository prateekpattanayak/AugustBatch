package Polymorphism;

public class MethodOverRiding_Example {


		//constructor overloading
		
		
				MethodOverloading_Example() {
					
					System.out.println("i am in default MethodOverloading_Example constructor method");
					
				}
		
			
				//static methods
				
				static void staticMethod() {
					
					System.out.println("i am in default MethodOverloading_Example staticMethod");
				}
				
				//final methods
				
				final void finalMethod() {
					
					System.out.println("i am in default MethodOverloading_Example final method");
				}
				
				//normal method
				
				void method() {
					
					System.out.println("i am in default MethodOverloading_Example method");
				}
				
				
				
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			MethodOverloading_Example me=new MethodOverloading_Example();
		
			staticMethod();
		
			me.finalMethod();
	
			
			me.method();
			
			

	}

}
