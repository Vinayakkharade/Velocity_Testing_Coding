package mainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestJava.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public String verifyPageTitle(String expectedTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		return actualTitle;
	}
	
	@Test
	public void VerifyusernameField(String username1){
		Assert.assertEquals(username.isDisplayed(), true);
		username.sendKeys(username1);
	}
	@Test
	public void VerifypasswordField(String password1){
		Assert.assertEquals(password.isDisplayed(), true);
		password.sendKeys(password1);
	}
}
