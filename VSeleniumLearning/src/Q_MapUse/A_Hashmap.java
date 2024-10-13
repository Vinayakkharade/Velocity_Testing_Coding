package Q_MapUse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Hashmap {
	public static WebDriver driver;
	
	public static HashMap<String,String> getCrendentails() {
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("vinayak", "Admin:admin123");
		hm.put("vihaan", "ad:admin1234");
		return hm;
	}
	
	static public String getUsername(String username) {
		String username1=getCrendentails().get(username);
		return username1.split(":")[0];
	}
	
	static public String getPassword(String password) {
		String password1=getCrendentails().get(password);
		return password1.split(":")[1];
	}
	
	public static void main(String[]args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				
				FileInputStream fileIn=new FileInputStream("C:\\Users\\vinuk\\ECLIPSE\\VSeleniumLearning\\configure.properties");
				Properties p=new Properties();
				p.load(fileIn);
				String s1=getCrendentails().get("vinayak");
				System.out.print(s1);
			//String user=p.getProperty("myusername");
			//String pass=p.getProperty("myusername");
				driver.findElement(By.id("txtUsername")).sendKeys(getUsername(p.getProperty("myusername")));
				driver.findElement(By.id("txtPassword")).sendKeys(getPassword(p.getProperty("myusername")));
				driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
}
