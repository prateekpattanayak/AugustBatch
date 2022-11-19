package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st way : create object using List interface

		Map<Integer, String> mapvalues = new HashMap<>();

		// 2nd way : create object using child class

		HashMap<Integer, String> hashMapvalues = new HashMap<>();

		mapvalues.put(1, "Saag");

		mapvalues.put(2, "Testing");

		mapvalues.put(3, "Java");

		mapvalues.put(4, "Selenium");

		System.out.println("mapvalues are :" + mapvalues);

		System.out.println("================================");

		System.out.println(mapvalues.keySet());

		System.out.println("================================");

		System.out.println(mapvalues.values());
		
		System.out.println("================================");

		System.out.println(mapvalues.entrySet());


		System.out.println("================================");
		mapvalues.replace(3, "Pratheek");

		System.out.println("mapvalues are :" + mapvalues);

		System.out.println("================================");

		mapvalues.replace(3, "Pratheek", "Naresh");

		System.out.println("mapvalues are :" + mapvalues);

		System.out.println("================================");

		mapvalues.remove(3);

		System.out.println("mapvalues are :" + mapvalues);

		System.out.println("================================");
		
		System.out.println("================================");

		mapvalues.remove("Testing");

		System.out.println("mapvalues are :" + mapvalues);

		System.out.println("================================");

		mapvalues.remove(1, "Saag");

		System.out.println("mapvalues are :" + mapvalues);

		System.out.println("================================");

	}

}

	
