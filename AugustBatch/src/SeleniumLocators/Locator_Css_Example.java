package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Css_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chrome driver extension

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//chrome driver launching
		
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		//absolute xpath
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Saag Testing");
		
		//relative xpath
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("saag");
		
		
		
		
		
		
	}

}
