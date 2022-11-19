package Oops;

public class ExamoleofClassAndObject {

	
	String name="Saag";
	
	int a=10;
	
	public void add() {
		
		int b=10;
		
		System.out.println(a+b);
	}
	
	public static void sub() {
		
		int b=10;
		
		int c=10;
		
		System.out.println(c-b);
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub();
		
		ExamoleofClassAndObject ep=new ExamoleofClassAndObject();
		
		ep.add();
		
		System.out.println(ep.name);
		
		System.out.println(ep.a);

	}

}
