package SeleniumJavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//scroll to pixel
	
	js.executeScript("window.scrollBy(0,300)");
		
		//scroll to down
		
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		System.out.println("========");
		
		js.executeScript("window.location='https://www.facebook.com/'");
		
		driver.close();
		
		
	}

}
