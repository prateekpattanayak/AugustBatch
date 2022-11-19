package Operator;

public class BinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		int a=10;
		int b=15;
		int c=20;
		
		System.out.println(a<b & a<c);//true & true : true
		
		System.out.println(b<a & a<c);//false & true :false
		
		System.out.println(b<a | a<c);//true
		
		System.out.println(a<b | a<c);//true
		
		System.out.println(b<a | c<a);//false

	}

}
