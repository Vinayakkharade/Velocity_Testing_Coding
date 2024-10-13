package G_Alert_popup_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Simple_Alert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/popups");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='alert']")).click();

		String text=driver.switchTo().alert().getText();
		System.out.print(text);
		driver.switchTo().alert().accept();

	}

}
