package A_launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Use_locator {
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String text=driver.findElement(By.xpath("//*[text()='LOGIN Panel']")).getText();// find text in script using xpath
	System.out.println(text);
	
	String text1=driver.findElement(By.xpath("//*[contains(text(),'Forgot')]")).getText();// find the text using contaions using xpath attribute
	System.out.println(text1);
	
    if(text1.equals("Forgot your password?"))
    	System.out.println("test is passed:login page is working");
	
    driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");// Using the  xpath with name attribute.
	
    driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");// using contains key in xpath with name attribute & value
    
    driver.findElement(By.xpath("//*[@name='Submit' and @id='btnLogin']")).click();
	
    Thread.sleep(2000);
 String s1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]]")).getText();
 
 System.out.println(s1);
	
   // driver.findElement(By.linkText("Welcome Paul")).click();//
   //Thread.sleep(1000);
    
    //driver.findElement(By.partialLinkText("Log")).click();// 
	
	//driver.quit();
}
}
