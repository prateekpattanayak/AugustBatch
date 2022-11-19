package String;

public class StringMethods_CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String game="Cricket";
				
		String game1="Cricket";
		
		System.out.println(game.compareTo(game1));
				
		System.out.println("===========");
		
		String game2="Crick";
				
	System.out.println(game.compareTo(game2));
	
	System.out.println(game2.compareTo(game));
	
	System.out.println("===========");
	
	String game3="Cricket";
	
	System.out.println(game.compareToIgnoreCase(game1));//0
	
	System.out.println(game.compareToIgnoreCase(game3));//0
	
	
	}

}
