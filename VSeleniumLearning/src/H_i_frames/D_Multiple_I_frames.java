package H_i_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Multiple_I_frames {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		
		
		//WebElement parentframe=driver.findElement(By.xpath("//*[@id='Multiple']//iframe"));
		
		//WebElement childframe=driver.findElement(By.xpath("//*[@class='container']//iframe"));
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("mic check mic check");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//b[@id='topic']//following::input")).clear();
		
		

	}

}
