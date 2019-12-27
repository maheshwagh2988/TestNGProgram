package XpathExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandelMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver-v0.24.0-win64 - Copy\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.firefox.marionette", "D:/Automation/geckodriver-v0.24.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://www.naukri.com/");
		String Parent=driver.getWindowHandle();
		System.out.println(Parent);
		//driver.close();
	}

}
