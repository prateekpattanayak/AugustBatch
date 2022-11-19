package SeleniumxpathsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//chrome browser extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
				//chrome browser launching


				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

		driver.get("https://www.meesho.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.getCurrentUrl());
		
	driver.findElement(By.xpath("//span[contains(text(),'Women Western')]")).click();	
		
		//1st way
		
	
		
	driver.findElement(By.xpath("//p[contains(text(),'Jeans')][1]")).click();
		//2nd way
		
		//(//p[starts-with(text(),'Jeans')])[1]
		
		//3rd way
		
	
		//driver.findElement(By.xpath("(//p[text()='Jeans'])[1]")).click();	

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getCurrentUrl());
		

		
		
		
		
	}

}
