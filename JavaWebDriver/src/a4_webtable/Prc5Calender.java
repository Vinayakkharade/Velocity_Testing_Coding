package a4_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Prc5Calender {
 public static void main(String[]args)
 {
	 System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
	   driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
	   
	   for(int i=0;i<=100;i++)
		{
			driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
    String month=driver.findElement(By.xpath("/html/body/div/div/div")).getText();
      if(month.equals("May 2024"))
       break;
		}
	   driver.findElement(By.linkText("20")).click();
	 String date= driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[1]")).getText();
	 System.out.println("Selected date="+date);
 }
}
