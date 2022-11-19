package InterfaceAndAbstractClass;


interface Example_Interface2 {

	int number1 = 100;

	static float value1 = 7786568568.578f;

	// abstract methods

	public abstract void method_1();

	public abstract void method_2();

	public abstract void method_1(int a);

	// normal /concrete methods

	public default void method3() {

		System.out.println("I am in Example_Interface2 method3 ");
	}

	public static void method4() {

		System.out.println("I am in Example_Interface2 method4 ");
	}
}

//4