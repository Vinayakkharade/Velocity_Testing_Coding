package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class full {


public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/");// open the url page
	driver.manage().window().maximize();// it maximize the screen
	// full screenshot of page
	//TakesScreenshot ts=(TakesScreenshot)driver;// interface
	
	//File scr=ts.getScreenshotAs(OutputType.FILE);// it take the screenshot & stored in one file
	//File targ=new File(".\\screenshot\\fullscreen.png");// we create the one folder in project
	
	//FileUtils.copyFile(scr,targ);// copy the full screenshot in created folder. 
	
	/// screenshot of section of page
	
	WebElement section=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]"));// capture the section loaction 
	
	File sec=section.getScreenshotAs(OutputType.FILE);
	File tagetsection=new File(".\\screenshot\\section.jpeg");
	
	FileUtils.copyFile(sec,tagetsection);//
	
}
}
