package Arrays;

public class ArraysExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primitiveDatatype
		
		//1st way to create Array
		
		int[] integerArray=new int[5];
		
		System.out.println("===========");
		
		//2nd way to create Array
		
		char characterArray[]=new char[6];
		
		System.out.println("===========");
		
		//Wrapper classes
		
		//1st way to create Array
		
		Integer[] integerArray1=new Integer[5];
		
		System.out.println("===========");
		
		//2nd way to create Array
		
		Character characterArray1[] =new Character[6];
		
		System.out.println("===========");
		
		//initializing values to array

		//1st way to add values to array

		int[] integer_Array=new int[5];
		
		integer_Array[0]=10;
		
		integer_Array[1]=20;
		
		integer_Array[2]=30;
		
		integer_Array[3]=40;
		
		integer_Array[4]=50;

		System.out.println("integer_Array size is :"+ integer_Array.length);
		
		System.out.println(integer_Array[3]);
		

		for (int i = 0; i < integer_Array.length; i++) {
			
			System.out.println(integer_Array[i]);
	}
		
		
	for (int i = integer_Array.length -1;i>0;i--) {
		System.out.println(integer_Array[i]);
		
	}
		System.out.println("========");
	
		//2nd way to add values to arrays
		
		char[] charArray= {'s','a','a','g'};
		
		System.out.println("charArray size is :" + charArray.length);
		
		System.out.println(charArray[1]);

		for(int i=0; i< charArray.length;i++) {
			
			System.out.println(charArray[i]);
		}
		System.out.println("========");

	for(int i=charArray.length -1;i>=0;i--) {
		System.out.println(charArray[i]);
	}
	}
	}
	


