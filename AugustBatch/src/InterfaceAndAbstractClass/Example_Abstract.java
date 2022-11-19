package InterfaceAndAbstractClass;

public abstract class Example_Abstract {

	

			int number = 10;

			static float value = 78568.578f;

			Example_Abstract() {

				System.out.println("I am in Example_Abstract constructor method");
			}

			// abstract methods

			public abstract void method1();

			public abstract void method2();

			public abstract void method1(int a);

			// normal /concrete methods

			public void method3() {

				System.out.println("I am in Example_Abstract method3 ");
			}

			public void method4() {

				System.out.println("I am in Example_Abstract method4 ");
			}
		}

	
//1