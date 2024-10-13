package B_Dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class E_Practice1 {
	static WebDriver driver;
	static RemoteWebDriver a;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	
	WebElement dr1=driver.findElement(By.cssSelector("[class=col-lg-3][id=first]"));
	Select s1=new Select(dr1);
	s1.selectByVisibleText("Iphone");
	
	WebElement dr2=driver.findElement(By.cssSelector("[class=col-lg-3][id=animals]"));
	Select s2=new Select(dr2);
	s2.selectByVisibleText("Avatar");

	List<WebElement>dr3=driver.findElements(By.cssSelector(".dropdown.show>ul"));
	for(WebElement custom:dr3)
		if(custom.getText().equals("span")) {
			custom.click();
			Thread.sleep(2000);
	      System.out.println(custom.getText());
}
}
}