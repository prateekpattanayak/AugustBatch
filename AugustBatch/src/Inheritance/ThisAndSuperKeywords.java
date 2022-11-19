package Inheritance;

public class ThisAndSuperKeywords extends parent_class{
	
	int number=10;
	
	String name="Testing";
	
	public void method1() {
		
		System.out.println("I am in ThisAndSuperKeywords class method1 ");
		
		System.out.println(this.name);
		
		System.out.println(name);
		
		System.out.println(number);
		
		System.out.println(super.name);
	}
	
	public void method() {
		
		super.method1();
		
		super.method2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisAndSuperKeywords ts=new ThisAndSuperKeywords();
		
		ts.method1();
		
		ts.method2();
		
		System.out.println(ts.name);
		
		System.out.println(ts.number);
		
		

	}

}
