package a4_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prc4Calender {
public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
	  driver.get("http://demo.automationtesting.in/Datepicker.html");
	
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
	     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]")).click();
		Select y=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]")));
		y.selectByVisibleText("2035");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]")).click();
		Select m=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]")));
		m.selectByVisibleText("April");
		
	    driver.findElement(By.linkText("29")).click();
	         
	    String s=driver.findElement(By.xpath("/html/body/section/div[2]/div/div[5]/footer/div/div/div[1]")).getText();
	    System.out.println(s);
	}
	

}