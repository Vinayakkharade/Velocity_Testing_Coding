package i_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("soham");
}
}

//why i-frames req.to handle?
//--some elements are present in i-frames.So to perform some operation on elements we req.to handles 1st i-frames. 
