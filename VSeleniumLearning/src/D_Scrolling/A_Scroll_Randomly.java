package D_Scrolling;

import org.openqa.selenium.By;//class
import org.openqa.selenium.JavascriptExecutor;// interface
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;// interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;// class

public class A_Scroll_Randomly {
	static WebDriver driver;
	
	public void LoginOrangeHrm() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	public void Scroll() throws InterruptedException {
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-600)");
		
		WebElement textbox=driver.findElement(By.cssSelector("#searchSystemUser_userName"));
		js.executeScript("arguments[0].value='vsk';",textbox);
		//Thread.sleep(3000);
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(Keys.F5);
		
		//js.executeScript("window.resizeTo(350,600);");
		
	}
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	driver.manage().window().maximize();
	A_Scroll_Randomly login=new A_Scroll_Randomly();
	login.LoginOrangeHrm();
	login.Scroll();
}
}
