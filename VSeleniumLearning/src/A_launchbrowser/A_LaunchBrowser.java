package A_launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty(" "," ");

      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
    driver.get("https://www.facebook.com/");
      
     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
     
     WebElement panel=driver.findElement(By.id("logInPanelHeading"));
      System.out.println(panel.getAttribute("id")); 
      System.out.println(panel.getText()); 
     
    Dimension browsersize=driver.manage().window().getSize();
   
    System.out.println(browsersize.getHeight());
    System.out.println(browsersize.height);
    System.out.println(browsersize.width);
     Dimension dim=new Dimension(500,600);
     driver.manage().window().setSize(dim);
     Thread.sleep(2000);
     driver.manage().window().maximize();
 
  
   Dimension dimen= driver.manage().window().getSize();
  int height =  dimen.getHeight();
  panel.sendKeys(Keys.F5);
	}

}
