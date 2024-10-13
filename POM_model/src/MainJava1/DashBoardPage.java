package MainJava1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoardPage extends BaseClass {
	//mention all locators
	@FindBy(xpath="//a[@id='welcome']")
	WebElement Welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutButton ;
	
	@FindBy(id="MP_link")
	WebElement linkClick ;
	

	// intialize the driver variable
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String DashBoardTitle(String ExpecteddashBoardTitle) {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	String actualdashBoardTitle=driver.getTitle();
	Assert.assertEquals(actualdashBoardTitle, ExpecteddashBoardTitle);
	  return actualdashBoardTitle;
	}
	
	public void varifylogout() {
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		Welcome.click();
		logoutButton.click();
	}
	
	public void varifySwithOfSecondTAB() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		linkClick.click();
		
	}
	
	}


