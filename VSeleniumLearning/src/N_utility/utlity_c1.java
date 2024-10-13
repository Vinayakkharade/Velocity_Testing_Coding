package N_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class utlity_c1 {

	public void ScrnShot(String capture1) throws IOException {
		TakesScreenshot shot=(TakesScreenshot)GlobalClass.driver;
		
		File path=shot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\"+capture1+".png");
		
		FileHandler.copy(path, destination);
		
	}
}
