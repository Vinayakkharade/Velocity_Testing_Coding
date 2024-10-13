package G_Alert_popup_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_Confiramtion_pop_alert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		
		driver=new ChromeDriver(options);// invoke the chrome
		driver.get("https://chercher.tech/practice/popups");
		//driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@name='confirmation']")).click();

		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();

		//prompt popup
	driver.findElement(By.xpath("//*[@name='prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("accept");
		
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().dismiss();
	}
}