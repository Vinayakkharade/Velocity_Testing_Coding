package M_Properties_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Use_properties_file {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// Arragement for use of properties file
		FileInputStream fileIn=new FileInputStream("C:\\Users\\vinuk\\ECLIPSE\\VelocitySeleniumLearning\\config.properties");
		Properties pro=new Properties();
		pro.load(fileIn);

		System.setProperty(pro.getProperty("key"),pro.getProperty("path"));

		driver=new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//*[@name='Submit' and @id='btnLogin']")).click();

	}

}
