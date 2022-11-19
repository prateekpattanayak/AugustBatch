package SeleniumAlerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dismiss_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getTitle());

		driver.findElement(By.id("promtButton")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.switchTo().alert().dismiss();
		
		//driver.close();

		
		
		
		
	}

}
