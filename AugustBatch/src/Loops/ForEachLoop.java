package Loops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]names= {"papu","sapu","gapu","lapu","kapu"};
		
		for (String name : names) {
			
			System.out.println(name);
		}
		
		System.out.println("=======");
		
		int[] numbers= {1,2,45,4,65};
		
		for(int value :numbers) {
			
			System.out.println(value);
		}
		
	}

}
