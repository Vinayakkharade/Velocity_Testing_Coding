package javalearning;

public class A1 {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "path of driver");

		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
			driver.manage.window.maximaze();
	}

}
