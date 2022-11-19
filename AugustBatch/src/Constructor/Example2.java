package Constructor;

public class Example2 {

		
		Example2(){
			
			System.out.println("i am in constructorExample method");
			
		}
			Example2(int value){
				System.out.println("i am in constructorExample  method : "+ value);
		}
			
			Example2(String name){
				System.out.println("i am in constructorExample method :"+ name);
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 Example2 ex=new  Example2();
			 
			 Example2 ex1=new  Example2(56);
			 
			 Example2 ex2=new  Example2("Saag");
			 
			 Example2 ex3=new  Example2();
		
		

	}

}
