package InterfaceAndAbstractClass;


public class Interface_Example implements Example_Interface1, Example_Interface2 {

	public static void main(String args[]) {

		Interface_Example ie = new Interface_Example();
		
		System.out.println(ie.number);

		System.out.println(ie.number1);

		System.out.println(ie.value);

		System.out.println(ie.value1);

		ie.method1();

		ie.method2();

		ie.method1(1450);

		ie.method_1();

		ie.method_1(6789);

		ie.method_2();

		ie.method3();
		
		System.out.println("===========================");

		// object to the parent class

		Example_Interface1 ex1 = new Interface_Example();

		System.out.println(ex1.number);

		System.out.println(ex1.value);

		ex1.method1();

		ex1.method1(6765);

		ex1.method2();
		
		System.out.println("===========================");

		// object to the parent class

		Example_Interface2 ex2 = new Interface_Example();

		System.out.println(ex2.number1);

		System.out.println(ex2.value1);
		
		ex2.method_1();

		ex2.method_1(676578);

		ex2.method_2();
		
		ex2.method3();
		
		Example_Interface2.method4();
	}

	
	@Override
	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("I am in Interface_Example method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("I am in Interface_Example method2");

	}

	@Override
	public void method1(int a) {
		// TODO Auto-generated method stub
		System.out.println("I am in Interface_Example method3 " + a);

	}

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		System.out.println("I am in Interface_Example method_1");

	}

	@Override
	public void method_2() {
		// TODO Auto-generated method stub
		System.out.println("I am in Interface_Example method_2");

	}

	@Override
	public void method_1(int a) {
		// TODO Auto-generated method stub
		System.out.println("I am in Interface_Example method_1" + a);

	}
}

//5