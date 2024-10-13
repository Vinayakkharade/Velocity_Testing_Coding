package i_frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleParentI_frame {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver(); // invoke the chromedriver
	
	driver.get("https://www.w3school.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	
}
}
