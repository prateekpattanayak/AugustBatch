package Polymorphism;

public class MethodOverloading_Example {

	//constructor overloading
	
	
			MethodOverloading_Example() {
				
				System.out.println("i am in default MethodOverloading_Example constructor method");
				
			}
	
		
			MethodOverloading_Example(String name,int age,float number){
				
				System.out.println("i am in default MethodOverloading_Example constructor method:"+name+""+age+""+number);
			}
			
			//static methods
			
			static void staticMethod() {
				
				System.out.println("i am in default MethodOverloading_Example staticMethod");
			}
			
			
			static void staticMethod(int age) {
				
				System.out.println("i am in default MethodOverloading_Example static method"+age);
			}
			
			//final methods
			
            final void finalMethod() {
				
				System.out.println("");
			}
			
			final void finalMethod(int age) {
				
				System.out.println("i am in default MethodOverloading_Example final method"+age);
			}
			
			//normal method
			
			void method() {
				
				System.out.println("i am in default MethodOverloading_Example method");
			}
			
			
			void method(int age) {
				
				System.out.println("i am in default MethodOverloading_Example constructor method"+age);
			}
			
			
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading_Example me=new MethodOverloading_Example();
		
		MethodOverloading_Example me1=new MethodOverloading_Example("saag",10,67);
		
		
		staticMethod();
		
		staticMethod(10);
		
	
		me.finalMethod();
		
		me1.finalMethod(34);
		
		
		me1.method();
		
		me1.method(56);
		
		
	}

}
