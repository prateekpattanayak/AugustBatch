package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ClassName_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome browser extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");		
				
				//chrome driver launching
				
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://testautomationpractice.blogspot.com/");
				
			driver.manage().window().maximize();
			
			
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Babu");
		
		
		driver.close();
		
	}

}
