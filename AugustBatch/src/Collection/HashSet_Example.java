package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way: create object using List interface
		
		Set<String> stringSet = new HashSet<>();
		
		//2nd way: create object using child class
		
		HashSet<String> stringHashset =new HashSet<>();
		
		System.out.println("=======");
		
		stringSet.add("Saag");
		
		stringSet.add("Java");
		
		stringSet.add("Testing");
		
		stringSet.add("Batch");
		
		System.out.println("Data in stringSet is :" +stringSet);
		
		System.out.println("=======");
		
		stringSet.add("Saag");
		
		stringSet.add("Java");
		
		stringSet.add(" ");
		
		stringSet.add(" ");
		
		System.out.println("Data in after adding duplicate and null values is :"+ stringSet);
		
		System.out.println("=======");
		
		System.out.println("size of stringSet is :"+stringSet.size());
		
		System.out.println("=======");
		
		System.out.println("Before stringHashSet is :"+stringSet);
		
		stringHashset.addAll(stringSet);
		
		System.out.println("Before stringHashSet is :" +stringSet);
		
		System.out.println("=======");
		
		//Iterator in set interface is used to access the elements same like a get
		
		Iterator<String> iter =stringSet.iterator();
		
		while(iter.hasNext()) {
			String name =iter.next();
			
			System.out.println(name);
			
		}
		
		System.out.println("=======");
		
		System.out.println(stringSet.remove("Java"));
		
		
		System.out.println("Data in stringSet is :" +stringSet);
		System.out.println("=======");
		System.out.println(stringHashset.contains("Saag"));
		System.out.println(stringHashset.contains("RRR"));
		
		System.out.println("=======");
		
		System.out.println(stringSet.removeAll(stringHashset));
		
		System.out.println("Data in stringSet is :" +stringSet);
		
		stringHashset.clear();
		
		
		System.out.println("Data in stringSet is :" +stringSet);
		
		
		System.out.println("=======");
		
		System.out.println(stringSet.isEmpty());
		System.out.println(stringHashset.isEmpty());
		
		System.out.println("=======");
		
		
		
		
		
		
		
	}

}
