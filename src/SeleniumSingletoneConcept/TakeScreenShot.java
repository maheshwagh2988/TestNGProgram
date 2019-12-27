package SeleniumSingletoneConcept;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TakeScreenShot {

	public static void main(String[] args) {
		WebDriver dr= new InternetExplorerDriver();
		dr.get("www.google.com");
		File screenshot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
		FileUtils.copyFile(screenshot, new File("D:\\SoftwareTestingMaterial.png"));
		}catch(Exception e){
			
		}
	}

}
