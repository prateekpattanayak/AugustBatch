package SeleniumWebTableAndCalenderHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandling_StaticWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");		

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		System.out.println(driver.getTitle());

		WebElement date =driver.findElement(By.id("datepicker"));
		
		if(date.isDisplayed()) {
			
			System.out.println("Date is displayed on webpage");
			
			date.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			
			WebElement table=driver.findElement(By.className("ui-datepicker-calendar"));
			
			if (table.isDisplayed()) {
			
				System.out.println("table is displayed on the webpage");
			
			WebElement data=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]"));
			
			if (data.getText().equalsIgnoreCase("20")) {
				
				System.out.println("Both data are same");
				
				data.click();					
				
			} else {
				
				System.out.println("Both data are different");

			}
		} else {
			System.out.println("table is not displayed on the webpage");

		}
	} else {
		System.out.println("Date is not displayed on the webpage");

	}
	
	driver.close();


			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}


