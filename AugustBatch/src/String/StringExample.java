package String;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String game="cricket";
System.out.println("game name is :"+game);

System.out.println("=========");

//length

System.out.println("character count in string is :"+game.length());//7
System.out.println("===========");

//ChartArt(int index)

System.out.println("character is "+game.charAt(4));//k

System.out.println("character is "+game.charAt(0));//c
System.out.println("===========");

//contains

System.out.println("contains is :"+game.contains("c"));//true

System.out.println("contains is :"+game.contains("s"));//false

System.out.println("===========");

//lowercase

System.out.println("Lowercase string is :"+ game.toLowerCase());

System.out.println("===========");

//uperCase

System.out.println("Upercase string is :" + game.toUpperCase());

System.out.println("===========");

//startswith

System.out.println("Startswwith string is: " +game.startsWith("c"));//true

System.out.println("Startswwith string is: " +game.startsWith("t"));//false

System.out.println("===========");

//endswith

System.out.println("endswith string is :"+ game.endsWith("t"));//true

System.out.println("endswith string is :"+ game.endsWith("l"));//false

System.out.println("===========");




	}
	

}
