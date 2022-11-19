package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3_FileNotFound {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try {
			
			File file =new File("C:\\Users\\prate\\Documents");
			
			
			
			FileInputStream fs = new FileInputStream(file);
		
			
		}catch (ArithmeticException ex) {
			
			System.out.println(ex.getLocalizedMessage());
			
		}catch(NullPointerException ex) {
			
			System.out.println(ex.getLocalizedMessage());
			
		}catch(FileNotFoundException e) {
			
			System.out.println(e.getLocalizedMessage());
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}

		
		
		
	}
		
	}


