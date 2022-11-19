package String;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer strbuf=new StringBuffer("Saag");//java 1 :slower
		
		StringBuilder strbui=new StringBuilder("Saag");//java 5 : faster
		
		String str=new String("Saag");
		
		System.out.println("======");
		
		System.out.println(strbuf);
		
		System.out.println(strbuf.reverse());
		
		System.out.println("======");
		
		System.out.println(strbui);
		
		System.out.println(strbui.reverse());
		
		System.out.println("======");
		
		System.out.println(strbuf.delete(0, 1));
		
		System.out.println(strbuf.append("Testing"));
		
		System.out.println(strbuf.delete(0, 3));
		
		System.out.println("======");
		
		for(int i=str.length()-1;i>=0;i--) {
			
			char charValue=str.charAt(i);
			
			System.out.println(charValue);
		}
	}

}
