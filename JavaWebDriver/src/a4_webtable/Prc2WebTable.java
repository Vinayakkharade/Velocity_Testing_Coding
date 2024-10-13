package a4_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prc2WebTable {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Testing Study Material/selenium study/mark new_ht.htm");
		

		int r=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("row="+r);
		
		int c=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
		System.out.println("coulmn="+c);
		
		int head=driver.findElements(By.xpath("/html/body/table/thead/tr")).size();
		System.out.println("Heading="+head);
		for(int n=1;n<=head;n++)
		{
		System.out.print(driver.findElement(By.xpath("/html/body/table/thead/tr["+n+"]")).getText()+"   ");
		}
		System.out.println();
		
	    for(int i=1;i<=r;i++)
		{
		  for(int j=1;j<=c;j++)
		  {
	      System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
		}
	  System.out.println();
		}
	}

		
	}

