package Collection;

import java.util.ArrayList;
import java.util.List;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way:create object using List interface
		
		List<Integer> intList=new ArrayList<>();
		
		
		//2nd way:create object using child class
		
		ArrayList<String> stringList=new ArrayList<>();
		
		System.out.println("======");
	
		intList.add(34);
		
		intList.add(43);
		
		intList.add(89);
		
		intList.add(67);
		
		System.out.println("Data in intList is :" + intList);
		
		intList.add(34);
		
		intList.add(43);
		
		intList.add(null);
		
		intList.add(null);
		
		System.out.println("Data in intList after adding duplicate and null values is :"+intList);
		
		System.out.println("========");
		
		System.out.println("size of intList is :" + intList.size());
		
		System.out.println("========");
		
		System.out.println(intList.get(0));
		
		System.out.println(intList.get(3));
		
		System.out.println("========");
		
		System.out.println("Data in intList before changing the value is :"+ intList);
		
		System.out.println(intList.set(0, 56));
		
		System.out.println("Data in intList after changing the value is :"+ intList);
		
		
	stringList.add("Saag");
		
	}

}
