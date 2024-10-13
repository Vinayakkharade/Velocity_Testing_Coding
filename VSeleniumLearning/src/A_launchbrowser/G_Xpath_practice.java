package A_launchbrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Xpath_practice {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
}
}
//types:1)absolute x-path---absolute xpath is x path desfined from source of element till the destination of element
// path get frame by using  only the "/"
// it is undirectional
// it is not preffered because it changes dynamically.

// relative xpath-
//In relative xpath we can transverse parent to child by skipping intermediate lines also we can back to parent,grandparent etc.
//path get frame by using only "//"
//it is highly recomended to use.


