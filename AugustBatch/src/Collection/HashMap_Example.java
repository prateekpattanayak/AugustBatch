package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1st way:create object using List interface
		
		Map<Integer, String> mapValues =new HashMap<>();
		
		//2nd way: create object
		
		HashMap<Integer, String> hashMapValues=new HashMap<>();
		
		
		mapValues.put(1, "Saag");
		
		mapValues.put(2, "Testing");
		
		mapValues.put(3, "Java");
		
		mapValues.put(1, "Selenium");
		
		System.out.println("mapValues are :"+mapValues);
		
		System.out.println("hashMapValues Before :"+hashMapValues);
		
		System.out.println("=======");
		
		hashMapValues.putAll(mapValues);
		
		System.out.println("hashMapValues after :"+hashMapValues);
		
		System.out.println("=======");
		
		System.out.println(hashMapValues.size());
		
		System.out.println("=======");
		
		System.out.println(hashMapValues.get(2));
		
		System.out.println("=======");
		
		System.out.println(hashMapValues.getOrDefault(2,"Testing"));
		
		System.out.println(hashMapValues.getOrDefault(10,"Testing"));
		
		System.out.println("=======");
		
		System.out.println(hashMapValues.containsKey(3));
		
		System.out.println(hashMapValues.containsKey(8));
		
		System.out.println("=======");
		
		System.out.println(hashMapValues.containsValue("Testing"));
		
		System.out.println(hashMapValues.containsValue("Prateek"));
		
		System.out.println("=======");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
