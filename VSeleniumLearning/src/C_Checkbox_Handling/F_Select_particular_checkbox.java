package C_Checkbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Select_particular_checkbox {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/dynamic-table");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement checkbox1=driver.findElement(By.xpath("//*[text()='google.com']//parent::tr//input"));
		checkbox1.click();

		WebElement checkbox2=driver.findElement(By.xpath("//*[text()='facebook.com']//parent::tr//input"));
		checkbox2.click();

	}

}
