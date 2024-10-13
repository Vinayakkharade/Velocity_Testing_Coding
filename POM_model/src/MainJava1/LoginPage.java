package MainJava1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import TestJava1.BaseTest;

public class LoginPage extends BaseTest {
	
	//All the locator by find by method
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement logButton;
	
	@FindBy(xpath="//span[@id='spanMessage']")
	WebElement msg ;
	
	//initialization of driver & other varaibles
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		//steps or methods to perform test cases related current webpage
	public String VerifypageTitle(String expectedTitle) {
		String actualTitle =driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		return actualTitle;
	}
	public String VerifyCurrentUrl(String Expectedurl) {
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, Expectedurl);
		return ActualURL;
	}
	
	public void LoginByCrediential(String enterUsername,String Enterpassword) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		username.sendKeys(enterUsername);
		password.sendKeys(Enterpassword);
		logButton.click();
	}
	public String verifymsg(String expectedMsg) {
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		String actualmsg=msg.getText();
		Assert.assertEquals(actualmsg, expectedMsg);
		return actualmsg;

	}

}
