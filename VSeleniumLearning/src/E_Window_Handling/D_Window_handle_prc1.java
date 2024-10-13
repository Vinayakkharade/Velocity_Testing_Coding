package E_Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Window_handle_prc1 {
static WebDriver driver;
 public void windowHandle() {
	 String primaryWindowID=driver.getWindowHandle();
	 
	 driver.findElement(By.xpath("//*[@id='tabButtonWrapper']//button")).click();
	 Set<String>AllwindowID =driver.getWindowHandles();
	 for(String singleID:AllwindowID)
		// System.out.print(singleID);
		 driver.switchTo().window(singleID);

		 if(driver.getWindowHandle().equals("ACC6B3EFB2D6C57B5AC475EE6D5713A4")) {
			String TEXT=driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
			
				System.out.println(TEXT);
			
		 }
		 
 }
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		D_Window_handle_prc1 window=new D_Window_handle_prc1();
         window.windowHandle();
	}

}
