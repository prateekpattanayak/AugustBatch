package Collection;


	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;

	public class LinkedList_Example2 {

		public static void main(String[] args) {

			LinkedList<Integer> intLinkedList = new LinkedList<>();

			intLinkedList.add(43);

			intLinkedList.add(34);

			intLinkedList.add(43);

			intLinkedList.add(89);

			intLinkedList.add(67);

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			System.out.println(intLinkedList.contains(34)); // true

			System.out.println(intLinkedList.contains(134)); // false

			System.out.println("=========================");

			intLinkedList.add(43);

			intLinkedList.add(43);

			intLinkedList.add(89);

			intLinkedList.add(67);

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			System.out.println(intLinkedList.indexOf(43)); // 1st occurence of the element :

			System.out.println("=========================");

			System.out.println(intLinkedList.lastIndexOf(43)); // 6

			System.out.println("=========================");

			intLinkedList.addFirst(6789);

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			intLinkedList.addLast(456);

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			System.out.println("=========================");

			intLinkedList.removeLast();

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			intLinkedList.removeFirst();

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			System.out.println("=========================");

			System.out.println(intLinkedList.getFirst());

			System.out.println("=========================");

			System.out.println(intLinkedList.getLast());

			System.out.println("=========================");

			System.out.println(intLinkedList.peek());

			System.out.println("Data in intLinkedList is :" + intLinkedList);

			System.out.println("=========================");

			System.out.println(intLinkedList.poll());

			System.out.println("Data in intLinkedList is :" + intLinkedList);

		}

	}






