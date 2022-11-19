package String;

public class StringMethods_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String game="Cricket";
		
		String game1="Cricket";
		
		System.out.println(game.equals(game1));//true
		
		System.out.println("========");
		
		String game2="cricket";
		System.out.println(game.equals(game2));//false
		
		System.out.println("========");
		
		System.out.println(game.equalsIgnoreCase(game1));//true
		
		System.out.println("========");
		
		System.out.println(game.equalsIgnoreCase(game2));//true
		
		System.out.println("========");
		
		
		
		
		
		
		
	}

}
