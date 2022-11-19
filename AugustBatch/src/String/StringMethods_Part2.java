package String;

public class StringMethods_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String movie= "Radhesyam";
		
		System.out.println("movie name is:"+ movie);//Radhesyam
		
		System.out.println("===============");
				
		System.out.println("character is :"+movie.indexOf("y"));//6
		
		System.out.println("character is :"+movie.indexOf("a"));//1
		
		System.out.println("===============");
		
		System.out.println("character is :"+movie.lastIndexOf("a"));//7
		
		System.out.println("=============");
		
		System.out.println(movie.concat("karthikeya"));
		
		System.out.println("=============");
		
		System.out.println(movie.replace("R", "s"));
		
		System.out.println("=============");
		
		String movie1="";
		
		System.out.println(movie.isEmpty());//false
		
		System.out.println(movie1.isEmpty());//true
		
		System.out.println("=============");
		
		System.out.println(movie.substring(6));
		
		System.out.println(movie.substring(2,5));
		
		
		
		
		
		
		
	}

}
