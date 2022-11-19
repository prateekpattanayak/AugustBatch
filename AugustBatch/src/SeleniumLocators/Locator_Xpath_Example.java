package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome driver extension

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//chrome driver launching
		
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("prateek");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("java");
		
		driver.close();
		
	}

}
