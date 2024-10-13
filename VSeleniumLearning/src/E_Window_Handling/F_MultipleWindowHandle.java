package E_Window_Handling;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_MultipleWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		List<WebElement>links=driver.findElements(By.xpath("//div[@id='social-icons']//img"));

		for(WebElement link:links) {
			link.click();
		}

		String primaryID=driver.getWindowHandle();
		Set<String> childIDs=driver.getWindowHandles();
		Thread.sleep(6000);
		for(String singleID:childIDs) {

			String acutalTitle=driver.switchTo().window(singleID).getTitle();
		
			if(acutalTitle.equals("LinkedIn")) {
				driver.switchTo().window(singleID);
				Thread.sleep(4000);
			driver.findElement(By.xpath("//p[@class='main__sign-in-container']//a")).click();
			Thread.sleep(2000);
			driver.close();
			}
			else if(acutalTitle.equals("YouTube"))
			{
				driver.switchTo().window(singleID);
				Thread.sleep(2000);
			driver.close();
			}
		}

	}
}
