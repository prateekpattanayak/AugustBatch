package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way :create object using List interface
		
		Set<String> stringSet =new TreeSet<>();
		
		//2nd way:create object using child class
		
		TreeSet<String> stringTreeSet=new TreeSet<>();
		
		System.out.println("===========");
		
		stringSet.add("Saag");
		
		stringSet.add("Java");
		
		stringSet.add("Testing");
		
		stringSet.add("Batch");
		
		System.out.println("Data in stringSet is :"+stringSet);
		
		System.out.println("===========");
		
		stringSet.add("Saag");
		
		stringSet.add("Java");
		
		stringSet.add("");
		
		stringSet.add("");
		
		System.out.println("Data in after adding duplicate and null values is :" +stringSet);
		
		System.out.println("===========");
		
		System.out.println("size of stringSet is :"+stringSet.size());
		
		System.out.println("===========");
		
		System.out.println("Before stringTreeSet is :" +stringTreeSet);
		
		stringTreeSet.addAll(stringTreeSet);
		
		System.out.println("Before stringTreeSet is :" +stringTreeSet);
		
		System.out.println("===========");
		System.out.println("===========");
	

		//iterator
		
				Iterator<String> iter=stringSet.iterator();
				
				while(iter.hasNext()) {
					
					String name =iter.next();
					
				
				System.out.println(name);
				}
		
				System.out.println("===========");
				
				System.out.println(stringSet.remove("Java"));
		

				System.out.println("Data in stringSet is :"+stringSet);
		
				System.out.println("===========");
				
				System.out.println("===========");
				System.out.println(stringSet.contains("Saag"));
				
				System.out.println(stringSet.contains("RRR"));
				
				System.out.println("===========");
				
				System.out.println(stringSet.removeAll(stringSet));
				
				System.out.println("Data in stringSet is :"+stringSet);
				
				System.out.println("===========");
				
				stringSet.clear();
				
				System.out.println("Data in stringSet is :"+stringSet);
				
				
				System.out.println("===========");
				
				
				System.out.println(stringSet.isEmpty());
				
				System.out.println(stringTreeSet.isEmpty());
				
				System.out.println("===========");
				
				
				
				
				
				
				
				
		
				
				
				
				
				
		
		
		
		
		
		
		
		
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


