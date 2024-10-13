package C_Checkbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Radio_Button_Handling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement male=driver.findElement(By.cssSelector("input[name='radiooptions'][value='Male']"));
		WebElement female=driver.findElement(By.cssSelector("input[name='radiooptions'][value='FeMale']"));
		if(male.isEnabled()) {
			male.click();
		}
		male.getAttribute(null)
		Thread.sleep(2000);
		
		if(male.isSelected()) {
			female.click();
		}
		
		Thread.sleep(2000);
		if(female.isSelected()) {
			male.click();
	}
	}
}