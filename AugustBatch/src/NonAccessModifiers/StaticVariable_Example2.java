package NonAccessModifiers;

public class StaticVariable_Example2 extends StaticVariable_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way
		
		System.out.println(value);
		
		method1();
		
		System.out.println("=======");
		
		//2nd way
		
		System.out.println(StaticVariable_Example2.value);
		
		StaticVariable_Example2.method1();
		
		System.out.println("======");
		
		//3rd way
		
		StaticVariable_Example2 sve=new StaticVariable_Example2();
		
		System.out.println(sve.value);
		
		sve.method1();
		
		sve.verifyValue();
		
		System.out.println("====");
		value=false;
	}

}
