package Exception;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		
		try {
			
			number=10/0;
			
		}catch (ArithmeticException ex) {
			
			System.out.println(ex.getLocalizedMessage());
			
		}finally {
			
			System.out.println("I am in finally block");
		}
		
		
		
		System.out.println(number);
		
		
		
	}

}
