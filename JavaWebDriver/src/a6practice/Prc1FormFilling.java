package a6practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prc1FormFilling {
public static void main(String[] args) {
	{
 System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("VIHAAN");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("KHARADE");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("9096502750");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("INDIA");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("KOLHAPUR");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("vihaankh1234@gmail.com");
		
	    System.out.println(driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[1]/td/label")).isSelected());
	    System.out.println(driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[2]/td/label")).isSelected());
	 
	    driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[1]/td/label")).click();
	    
	       driver.findElement(By.name("RESULT_RadioButton-9")).click();
	       Select f=new Select(driver.findElement(By.name("RESULT_RadioButton-9")));
	     //  f.selectByVisibleText("Evening");
	      // f.selectByIndex(3);
	       f.selectByValue("Radio-2");
	       //driver.findElement(By.name("RESULT_FileUpload-10")).click();
	       
	    // driver.findElement(By.name("Submit")).click();
	       
	}
}

}
