package SeleniumFrames;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("windowButton")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String>childWindows=driver.getWindowHandles();
		
		System.out.println("parentWindow size is :"+parentWindow);
		
		System.out.println("childWindows size is :"+childWindows.size());
		
		Iterator<String>iter=childWindows.iterator();
		
		while(iter.hasNext()) {
			
			String child=iter.next();
			
			if(!parentWindow.equals(child)) {
			
			driver.switchTo().window(child);
			
			String childWindowText=driver.findElement(By.id("sampleHeading")).getText();
			
			if (childWindowText.equalsIgnoreCase("This is a sample page")) {
				
				System.out.println(childWindowText +"is displayed on the webpage");
			}else {
			
			System.out.println(childWindowText +"is not displlayed on webpage");
			}
			
			}
			
		}
			//1st way
			
			driver.switchTo().defaultContent();
			
			//2nd way
			
			driver.switchTo().window(parentWindow);
			
			driver.findElement(By.id("tabButton")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			System.out.println(driver.getTitle());
			
			driver.quit();
			

			
			
			
			}		
			
			}
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
