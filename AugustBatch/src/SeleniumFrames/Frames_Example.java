package SeleniumFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1st way
		
	driver.switchTo().frame("frame-bottom");
	
	String name=driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]")).getText();
	
	if(name.equalsIgnoreCase("Bottom")) {
		
		System.out.println("Bottom frame is displayed on webpage");
	}else {
		System.out.println("Bottom frame is not displayed on webpage");
	}
		
	driver.switchTo().defaultContent();
	
	
	

	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
