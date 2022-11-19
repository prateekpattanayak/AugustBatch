package SeleniumWebTableAndCalenderHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandling_DyanamicWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getTitle());

		WebElement tableVerification = driver.findElement(By.xpath("//h2[text()='HTML Table']"));

		if (tableVerification.isDisplayed()) {

			System.out.println("Table Header is displayed on the webpage");

			WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

			if (table.isDisplayed()) {

				System.out.println("table is displayed on the webpage");

				List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));

				if (rows.size() > 0) {

					System.out.println("Rows is displayed in the webpage");

					for (int i = 2; i <= rows.size(); i++) {

						List<WebElement> columns = driver
								.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[" + i + "]/td"));

						if (columns.size() > 0) {

							System.out.println("Columns are displayed in the row");
							
							for(int j=1; j<columns.size(); j++) {
								
								WebElement data=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + i + "]/td["+j+"]"));

								if(data.getText().equalsIgnoreCase("Amit")) {
									
									System.out.println("Data is present in the row :" + i + " and column is :" + j);
								}
							}
						} else {
							System.out.println("Columns are not displayed in the row");
						}
					}
				} else {
					System.out.println("Rows is not displayed in the webpage");
				}
			} else {
				System.out.println("table is not displayed on the webpage");

			}
		} else {
			System.out.println("Table Header is not displayed on the webpage");

		}

		driver.close();

		
		
		
		
		
		
		
		
		
}
	
	
}