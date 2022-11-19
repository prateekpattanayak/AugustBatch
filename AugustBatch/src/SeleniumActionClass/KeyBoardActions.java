package SeleniumActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://testautomationpractice.blogspot.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

System.out.println(driver.getTitle());
		
WebElement field1=driver.findElement(By.id("field1"));
		
Actions act=new Actions(driver);

act.keyDown(Keys.CONTROL); //key down , pressing the key

act.sendKeys(field1, "a").build().perform();

act.sendKeys(Keys.DELETE).build().perform();
	
act.keyUp(Keys.CONTROL);//key up, realesing the key

act.keyDown(Keys.SHIFT);

act.sendKeys(field1, "prateek").build().perform();

act.keyUp(Keys.SHIFT);
driver.close();


		
	}

}
