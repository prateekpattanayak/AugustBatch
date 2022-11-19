package SeleniumXpathAxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following_Axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome browser extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");	
				// chrome browser launching

				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.get("https://www.meesho.com/");		

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				System.out.println(driver.getCurrentUrl());
				
				List<WebElement> following=driver.findElements(By.xpath("//span[text()='Women Ethnic']//following::span"));	

				System.out.println("Total number of following webelements in a webpage is :" + following.size());
				
				driver.close();

				
				

		
		
		
		
		
		
		
		
		
		
	}

}
