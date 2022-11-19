package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chromedriver extension
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		//chromrdriver launching
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();


		driver.findElement(By.id("windowButton")).click();
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
