package b_assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertValidation {
@Test
public void assertTest() {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String actualtitle=driver.getTitle();
	String expectedTitle="OrangeHRM12";
    Assert.assertEquals(actualtitle, expectedTitle);// it is hard assert.
    driver.quit();
    //  System.out.println(title);// actual result

}

}

// When the test case executed we dont know the test case is passed or failed. So we req validation.
// selenium is not providing the validation so We do the validation using TestNG which consist the asssert.class
// It consist the methods like assertequals, assertnotequals,asserttrue,assertfalse .so we using assertEquals method 
// compare the actual title of webpage with exepected title.
// assert class method called directly it not req obj creation
//
// Assertion is an expression which verify the actual testoutcome with excepted testoutcome.
