package ConditionalStatement;

public class if_else_if_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		if(num<100 && num>=1) {
			System.out.println("its a two digit number");
			
		}

		else if(num<1000 && num>=100) {
			System.out.println("its a three digit number");
		}
		
		else if(num<10000 && num>=1000) {
			System.out.println("its a four digit number");
		}
		
		else if(num<100000 && num>=10000) {
			System.out.println("its a five digit number");
			
		}
		
		else {
			System.out.println("number is not between 1 & 99999");
		}
	}

}
