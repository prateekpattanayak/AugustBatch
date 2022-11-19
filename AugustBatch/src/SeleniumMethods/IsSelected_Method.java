package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//chrome browser extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");		
				
				//chrome driver launching
				
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://www.facebook.com/");
				
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//label[text()='Male']//following-sibling::input")).click();
		
		System.out.println("Element is Selected :" +driver.findElement(By.xpath("//label[text()='Male']//following-sibling::input")).isSelected());
		
		driver.close();
	}

}
