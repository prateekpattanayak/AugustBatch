package Polymorphism;

public class RuntimePolymorphism extends MethodOverRiding_Example {

			//constructor overloading
			
			
			
				
					//static methods
					
					static void staticMethod() {
						
						System.out.println("i am in default MethodOverloading_Example staticMethod");
					}
					
		
					
					//normal method
					
					void method(int age) {
						
						System.out.println("i am in default MethodOverloading_Example method"+age);
					}
					
					void test() {
						this.method(78);
					}
					
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				MethodOverRiding_Example.staticMethod();
			
				RuntimePolymorphism.staticMethod();
				
				RuntimePolymorphism rp=new RuntimePolymorphism();
				
				MethodOverRiding_Example me=new MethodOverRiding_Example();
			
				rp.finalMethod();
				
				rp.method(10);  ;
				
				rp.test();
	}

}
