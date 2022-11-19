package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> mapValues = new HashMap<>();
		
		mapValues.put(1, "Saag");
		
        mapValues.put(2, "Testing");
		
		mapValues.put(3, "Java");
		
		mapValues.put(1, "Selenium");
		
		System.out.println("mapValues are :"+mapValues);
		
		System.out.println("=========");
		
		for(Map.Entry<Integer, String> valuesInMap : mapValues.entrySet()) {
			
			System.out.println(valuesInMap.getKey() + "="+  valuesInMap.getValue());
		}
		
		System.out.println("=========");
		
for (Map.Entry<Integer,String> entry :mapValues.entrySet())  {
	
	int Key =entry.getKey();
	
	String val =entry.getValue();
	
	System.out.println(Key + "=" + val);
	
	
}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
