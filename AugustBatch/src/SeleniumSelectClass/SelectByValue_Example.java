package SeleniumSelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getTitle());
		
		Select sec=new Select(driver.findElement(By.name("files")));
		
		sec.selectByValue("4");
		
		sec.selectByValue("1");
		
		sec.selectByValue("3");

		//driver.close();
		
		
	}

}
