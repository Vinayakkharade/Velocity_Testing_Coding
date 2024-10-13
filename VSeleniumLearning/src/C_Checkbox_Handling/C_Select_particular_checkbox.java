package C_Checkbox_Handling;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author vinuk
 *vinay
 */
public class C_Select_particular_checkbox {
	static WebDriver driver;
	
	public void LoginOrangngeHrm() throws InterruptedException {
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#divLoginButton input")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		WebElement checkbox=driver.findElement(By.id("ohrmList_chkSelectRecord_39"));
		
		boolean display=checkbox.isDisplayed();
		boolean enable=checkbox.isEnabled();
	       if(display==true && enable==true)
	    	   
	    	   checkbox.click();
	       if(checkbox.isSelected())
	    	   System.out.println("test is passed");
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		C_Select_particular_checkbox login=new C_Select_particular_checkbox();
		login.LoginOrangngeHrm();
	}
   }

