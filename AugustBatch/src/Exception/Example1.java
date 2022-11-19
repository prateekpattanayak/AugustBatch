package Exception;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		
		try {
			
			number=10/0;
			
		}catch(ArithmeticException ex) {
			
			
			System.out.println(ex.getLocalizedMessage());
		}
		
	
		System.out.println(number);
		
		
		
		
	}

}
