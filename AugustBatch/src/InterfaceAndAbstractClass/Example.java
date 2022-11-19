package InterfaceAndAbstractClass;

public class Example extends Example_Absract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			// object to the child class

			Example ex = new Example();

			System.out.println(ex.number);

			System.out.println(ex.value);

			ex.method1();

			ex.method1(10);

			ex.method2();

			ex.method3();

			ex.method4();

			System.out.println("================Parent class =============");
			
			// object to the parent class
			
			//syntax: parentclass object=new childclass()
			
			Example_Abstract ex1 = new Example();

			System.out.println(ex1.number);

			System.out.println(ex1.value);

			ex1.method1();

			ex1.method1(10);

			ex1.method2();

			ex1.method3();

			ex1.method4();
		}


	@Override
	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("I am in Example method1 ");

		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			System.out.println("I am in Example method2 ");

		}

		@Override
		public void method1(int a) {
			// TODO Auto-generated method stub
			System.out.println("I am in Example method1 " + a);

		}

	
}


//2