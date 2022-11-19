package variable;

public class Staticvariable_Exampe {

	//static variabe

		
		static boolean value=true;
			
			
			//2nd way to creat a method
			
			void verifyValue() {
				
				System.out.println("value is :"+ value);
				
				
			}
			
			//static method
			   static void method1() {
				
			System.out.println("i am in static method");
				
			}
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//1st way
				
				System.out.println(value);
				
				method1();
				System.out.println("............");
				
				//2nd way
				
				System.out.println(Staticvariable_Exampe.value);
				
				Staticvariable_Exampe.method1();
				System.out.println("........");
		
				//3rd way
				
				Staticvariable_Exampe sve=new Staticvariable_Exampe();
				
				
				System.out.println(sve.value);
				
			sve.method1();
				
				sve.verifyValue();
				
				System.out.println("..........");
				
				value=false;
				System.out.println(value);

				}
}