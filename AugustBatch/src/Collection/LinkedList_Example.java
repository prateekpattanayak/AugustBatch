package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way:create object using List interface
		
		List<Integer> intLinkedList =new LinkedList<>();
		
		//2nd way:Create object using Child class
		
		LinkedList<Integer> intList =new LinkedList<>();
		
		System.out.println("=======");
		
		intLinkedList.add(34);
		
		intLinkedList.add(43);
		
		intLinkedList.add(89);
		
		intLinkedList.add(67);
		
		System.out.println("Data in intLinkedList is :" + intLinkedList);
		
		
		System.out.println("=======");
		
		intLinkedList.add(34);

		intLinkedList.add(43);
		
		intLinkedList.add(null);
		
		intLinkedList.add(null);
		
		
		
		System.out.println("Data in intLinkedList after adding duplicate and null values is :" +intLinkedList);
		
		
		System.out.println("=======");
		
		System.out.println("========");
		
		System.out.println("size of intLinkedlist is :"+intLinkedList.size());
		System.out.println("=======");
		
		System.out.println(intLinkedList.get(0));
		
		System.out.println(intLinkedList.get(3));
		
		
		System.out.println("========");
		
		
		System.out.println("Data in intLinkedList before changing the value is :" +intLinkedList);
	
		System.out.println(intLinkedList.set(5,1990));
		
		System.out.println("Data in intLinkedList after changing the value is :" +intLinkedList);
		
		
		
		intList.add(17890);
		
		
		System.out.println("======");
		System.out.println("Data in intList is :"+intList);
		
		intList.addAll(intLinkedList);
		
		
		System.out.println("Data in intList is :"+intList);
		
		System.out.println(intList.remove(2));
		System.out.println("Data in intList is :"+intList);
		
		System.out.println(intList.removeAll(intList));
		
		
		System.out.println("Data in intList is :"+intList);
		
		System.out.println("======");
		
		intList.clear();
		System.out.println("Data in intList is :"+intList);
		
		
		System.out.println("======");
		
		
		
		//iterator
		
				Iterator<Integer> iter=intList.iterator();
				
				while(iter.hasNext()) {
					
					Integer intValue =iter.next();
					
				
				System.out.println(intValue);
				}
		
		
	}
	
	

	
	
	
	
	
	
	
}
