package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");

		// chrome browser launching

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Element is displayed :" + driver.findElement(By.id("email")).isEnabled());
		
		driver.findElement(By.id("email")).sendKeys("SaagTesting");
		
		driver.close();

			
	}

}
