package B_Dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class D_Calender_Handling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();

		for(int i=0;i>=0;i++) {
			WebElement nextButton=driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all"));
			nextButton.click();
			String title=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			if(title.equalsIgnoreCase("December 2040"))
				break;
		}
		driver.findElement(By.linkText("20")).click();;

	}
}