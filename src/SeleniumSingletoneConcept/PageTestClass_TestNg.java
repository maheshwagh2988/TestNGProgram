package SeleniumSingletoneConcept;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTestClass_TestNg {
		
		WebDriver driver;
		@BeforeMethod
		public void setUp(){
			DriverInit InstanceDriver =DriverInit.getInstance();
			driver=InstanceDriver.openBrowser();
		}
		@Test
		public void test1(){
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}
