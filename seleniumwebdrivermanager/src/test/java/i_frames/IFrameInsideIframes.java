package i_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameInsideIframes {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	
	//1st i-frames //
	WebElement firstframe=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
	driver.switchTo().frame(firstframe);
	
	//2nd i-frames //
	WebElement secondframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	driver.switchTo().frame(secondframe);
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("soham");
	
}
}
