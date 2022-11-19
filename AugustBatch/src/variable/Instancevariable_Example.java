package variable;

public class Instancevariable_Example {
	
//instance variable
	
	int number=100;
		
		
		//1st way to creat a method
		
		public void verifyInteger() {
			
			System.out.println("number is :"+ number);
			
			number=200;
			
			System.out.println("number is :"+ number);
			
		}
		public void verifyIntegervalue() {
			System.out.println("number is :"+ number);
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int a=10;
			
			System.out.println(a);
			
			
			//syntax: classname classvariable=new classname();
			
			Instancevariable_Example ive=new Instancevariable_Example();
			
			System.out.println("number is :"+ ive.number);
			
			ive.verifyInteger();
	
			
			System.out.println("number is :"+ ive.number);
			ive.number=300;
			
			ive.verifyIntegervalue();
			System.out.println("number is :"+ ive.number);

	


	}

}
