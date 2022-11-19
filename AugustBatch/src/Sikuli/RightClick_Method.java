package Sikuli;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class RightClick_Method {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		System.out.println(driver.getTitle());
		
		Screen sc=new Screen();
		
		Pattern date_TextBox =new Pattern("C:\\Users\\prate\\Documents\\26Aug2022\\26thAug022Batch\\src\\sikuliimages\\date_TextBox.png");

		sc.exists(date_TextBox);
		
		sc.rightClick(date_TextBox);

		driver.quit();
	}

}
