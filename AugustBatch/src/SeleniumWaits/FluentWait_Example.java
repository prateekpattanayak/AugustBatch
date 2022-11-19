package SeleniumWaits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//Fluent Wait
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);

		
		WebElement username = wait.until(new Function<WebDriver, WebElement>() {
		

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.id("email"));
			}
		});

		username.sendKeys("Testing");

		WebElement password = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.id("pass"));
			}
		});
		
		password.sendKeys("SaagTesting");

		//driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
