package SeleniumActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.meesho.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

System.out.println(driver.getTitle());
		
WebElement kids=driver.findElement(By.xpath("//span[text()='Kids']"));

Actions act=new Actions(driver);

act.moveToElement(kids).build().perform();

WebElement footwear=driver.findElement(By.xpath("//p[text()='Footwear']"));

act.click(footwear).build().perform();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

System.out.println(driver.getTitle());


driver.close();



	
		
		

	}

}
