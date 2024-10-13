package E_Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_D_Window_handle_prc2 {
	static WebDriver driver;
	
	public void windowHandle() throws InterruptedException {
		String parimaryID=driver.getWindowHandle();
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
		
		Set<String>AllID=driver.getWindowHandles();
		for(String singleID:AllID)

		//driver.switchTo().window(singleID);
		
		if(!parimaryID.equals(singleID))
		driver.switchTo().window(singleID);
			driver.manage().window().maximize();
			
			System.out.print(driver.findElement(By.xpath("//body//text()")).getText());
	}
	

public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
         E_D_Window_handle_prc2 window=new E_D_Window_handle_prc2();
         window.windowHandle();
}
}
