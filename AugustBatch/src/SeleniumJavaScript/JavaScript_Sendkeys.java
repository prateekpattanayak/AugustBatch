package SeleniumJavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScript_Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//1st way

		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Testing';");
		
		
		// 2nd way

		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		js.executeScript("arguments[0].value='saag';",field2);
		
		driver.close();
		
	}

}
