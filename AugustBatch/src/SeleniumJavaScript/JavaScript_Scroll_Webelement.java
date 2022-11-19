package SeleniumJavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Scroll_Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
		WebElement table =driver.findElement(By.xpath("//h2[text()='HTML Table']"));
		
		//scroll to pixel
		
		js.executeScript("arguments[0].scrollIntoView();",table);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
