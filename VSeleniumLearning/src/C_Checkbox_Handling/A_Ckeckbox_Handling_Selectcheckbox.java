package C_Checkbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Handling multiple checkbox
public class A_Ckeckbox_Handling_Selectcheckbox {
	static WebDriver driver;
	public void LoginOrangngeHrm() throws InterruptedException {
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#divLoginButton input")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//*[@id='tableWrapper']//table//tbody//tr//td//input"));
		for(WebElement checkbox:checkboxes)
			checkbox.click();
	}//*[@id='tableWrapper']//table//tbody//tr
	////*[@id='tableWrapper']//ancestor::tbody//tr//td//input
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		A_Ckeckbox_Handling_Selectcheckbox login=new A_Ckeckbox_Handling_Selectcheckbox();
		login.LoginOrangngeHrm();

	}
}
