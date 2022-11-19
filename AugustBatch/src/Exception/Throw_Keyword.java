package Exception;

public class Throw_Keyword {
	
	public static void add() throws FileNotFoundException {
		
		int a=10/0;
		
		throw new ArithmeticException();
		
	}

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		add();
		
		Thread.sleep(5000);
	}

}
