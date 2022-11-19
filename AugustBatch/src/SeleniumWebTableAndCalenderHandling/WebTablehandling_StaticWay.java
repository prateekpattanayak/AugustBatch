package SeleniumWebTableAndCalenderHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandling_StaticWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");	
			

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getTitle());

		WebElement tableVerification = driver.findElement(By.xpath("//h2[text()='HTML Table']"));

		if (tableVerification.isDisplayed()) {

			System.out.println("Table Header is displayed on the webpage");

			WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

			if (table.isDisplayed()) {

				System.out.println("table is displayed on the webpage");

				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[1]")).getText();

				if (data.equalsIgnoreCase("Master In Selenium")) {
					
					System.out.println("Both data are same");
					
				} else {
					
					System.out.println("Both data are different");

				}
			} else {
				System.out.println("table is not displayed on the webpage");

			}
		} else {
			System.out.println("Table Header is not displayed on the webpage");

		}
		
		driver.close();
	
			
			
			
		}
		
		
		
	}


