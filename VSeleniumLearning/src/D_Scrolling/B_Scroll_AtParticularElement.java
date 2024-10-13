package D_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Scroll_AtParticularElement {
static WebDriver driver;
	
	public void LoginOrangeHrm() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	public void Scroll() throws InterruptedException {
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		WebElement exceptedelement=driver.findElement(By.cssSelector("#ohrmList_chkSelectRecord_23"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",exceptedelement);
		Thread.sleep(2000);
		exceptedelement.click();
		js.executeScript("arguments[0].click();",exceptedelement);
		System.out.println(exceptedelement.isSelected());
		
		
	}
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	B_Scroll_AtParticularElement login=new B_Scroll_AtParticularElement();
	login.LoginOrangeHrm();
	login.Scroll();
}
}