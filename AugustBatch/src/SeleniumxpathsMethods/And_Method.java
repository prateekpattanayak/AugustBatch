package SeleniumxpathsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class And_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome browser extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");	
		//chrome browser launching


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

driver.get("https://www.meesho.com/");

System.out.println(driver.getCurrentUrl());

	driver.findElement(By.xpath("//span[@color='greyBase' and text()='Women Ethnic']")).click();
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
		
		
	}

}
