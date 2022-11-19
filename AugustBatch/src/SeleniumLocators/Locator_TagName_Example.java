package SeleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_TagName_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome browser extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		//chrome browser launching


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement>listOfInputTagNames=driver.findElements(By.tagName("div"));
		
		System.out.println("listOfInputTagNames is :" + listOfInputTagNames.size());
			
		
		driver.close();

		
		
		
	}

}
