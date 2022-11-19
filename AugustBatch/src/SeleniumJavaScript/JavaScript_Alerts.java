package SeleniumJavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("alert('welcome prateek')");
		
		driver.switchTo().alert().accept();
		
		//refresh the page
		
		js.executeScript("history.go(0)");
		
		//get title
		
		String titleofThePage =js.executeScript("return document.title").toString();
		
		System.out.println("titleofThePage is :"+titleofThePage);
		
		//get domain
		
		String domain =js.executeScript("return document.domain").toString();
		
		System.out.println("domain is :"+domain);
		
		//url
		
        String url =js.executeScript("return document.URL").toString();
		
		System.out.println("url is :"+url);
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
