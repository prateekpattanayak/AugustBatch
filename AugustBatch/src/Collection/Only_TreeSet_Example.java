package Collection;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;

	public class Only_TreeSet_Example {

		public static void main(String[] args) {

			// 1st way : create object using List interface

			TreeSet<String> stringSet = new TreeSet<>();

			stringSet.add("Saag");

			stringSet.add("Java");

			stringSet.add("Testing");

			stringSet.add("Batch");

			System.out.println("Data in stringSet is :" + stringSet);

			System.out.println("=========================");

			System.out.println("First element in a collection interface is :" + stringSet.first());

			System.out.println("=========================");

			System.out.println("last element in a collection interface is :" + stringSet.last());

			System.out.println("=========================");

			System.out.println(stringSet.pollFirst());

			System.out.println("Data in stringSet is :" + stringSet);

			System.out.println("=========================");

			System.out.println(stringSet.pollLast());

			System.out.println("Data in stringSet is :" + stringSet);

		}

	}

	
	
	
	
	

