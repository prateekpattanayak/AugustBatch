package SeleniumFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.switchTo().frame("frame2");
		
		String text=driver.findElement(By.id("sampleHeading")).getText();
		
		if(text.equalsIgnoreCase("This is a sample page")) {
			
			System.out.println( text + " is displayed on the webpage");
		}else {
			System.out.println(text + " is not displayed on the webpage");

		}
		
		driver.switchTo().defaultContent();

		driver.close();
		
		
		
		
		
		
		
		
	}

}
