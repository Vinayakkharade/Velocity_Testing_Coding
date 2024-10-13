package MainJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPageClass extends BaseClass11{
	@FindBy(xpath="//*[@class='head']//h1")
	WebElement dash;
	
	@FindBy(xpath="//span[text()='Assign Leave']")
	WebElement leavetab;
	
	@FindBy(xpath="//h1[text()='Assign Leave']")
	WebElement leavetitle;
	
	public DashBoardPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String titleOfDashBoard() {
		String actualtext = dash.getText();
		return actualtext;
	}
	public void tabclick() {
		leavetab.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String LeaveTab() {
		String actualText=leavetitle.getText();
        return actualText;
	}

}