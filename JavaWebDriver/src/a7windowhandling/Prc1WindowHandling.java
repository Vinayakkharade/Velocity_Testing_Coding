package a7windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Prc1WindowHandling {

	public static void main(String[]args)
	{
 System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
   WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		
		//String s=driver.getTitle();
		//System.out.println(s);
		
		Set <String> n=driver.getWindowHandles();//// gives the Id information of all windows which are open in browser.
		/// Set --- It is a class which is present in java stores the multiple values. 
	//	getWindowHandles() gives the Id information of all windows which are open in browser.
		
		for(String i:n)/// enhanced for loop
		{
			System.out.println(i);/// print the address of all windows which are open in browser
			String t=driver.switchTo().window(i).getTitle();
			if(t.contains("Frames & windows"))
			{
			driver.close();
			}	
		}
		}
	}
	
	
	

