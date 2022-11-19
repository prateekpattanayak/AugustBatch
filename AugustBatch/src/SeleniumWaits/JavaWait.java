package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://testautomationpractice.blogspot.com/");

Thread.sleep(5000);

driver.close();
		
		
		
		
		
	}

}
