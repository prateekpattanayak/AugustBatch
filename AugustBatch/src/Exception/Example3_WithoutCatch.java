package Exception;

public class Example3_WithoutCatch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		
		try {
			
		 number=10/0;
						
		} finally {
			System.out.println("I am in finally block");
		}
		
		System.out.println(number);

	}

}
