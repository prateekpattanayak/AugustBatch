package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way : Create object using List interface
		
		List<Integer> intList =new ArrayList<>();
		
		//2nd way : create object using child class
		
		ArrayList<Integer> intList1 =new ArrayList<>();
		
		System.out.println("=====");
		
		intList.add(34);
		
		intList.add(43);
		
		intList.add(89);
		
		intList.add(67);
		
		System.out.println("Data in intList is :"+ intList);
		
		System.out.println("=====");
		
		System.out.println("Data in intList1 is :"+ intList1);
		
		intList1.addAll(intList);
		
		System.out.println("Data in intList1 is :"+ intList1);
		
		
		System.out.println("=========================");

		System.out.println(intList.remove(2));

		System.out.println("Data in intList is :" + intList);

		System.out.println("=========================");

		System.out.println(intList.removeAll(intList));

		System.out.println("Data in intList is :" + intList);

		System.out.println("=========================");
		
		intList.clear();

		System.out.println("Data in intList is :" + intList);

		System.out.println("=========================");
		
		
//Iterator
		
		Iterator<Integer> iter=intList.iterator();
		
		while (iter.hasNext()) {
			
			Integer intValue =iter.next();
		}

		
		
		
		}
		
		
		
	}



