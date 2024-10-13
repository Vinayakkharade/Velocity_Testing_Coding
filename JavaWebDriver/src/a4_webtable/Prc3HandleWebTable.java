package a4_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prc3HandleWebTable {
public static void main(String[]args)
{
	String s1="Enabled";
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	driver.findElement(By.id("menu_admin_UserManagement")).click();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	
	String text=driver.findElement(By.id("searchBtn")).getText();
	System.out.println(text);
	
	int row=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
	System.out.println("NO.of rows="+row);
	int count=0;
	int count2=0;
	for(int i=1;i<=row;i++)
	{
		
	String s2=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[5]")).getText();
		if(s2.equals(s1)) {
			System.out.print(s2+" ");
			count=count+1;
		}
		else {
			count2=count2+1;
		}
			
		System.out.println();
	}
	System.out.println("no of enabled person="+count);
	System.out.println("no of disbaled person="+count2);
}

}





