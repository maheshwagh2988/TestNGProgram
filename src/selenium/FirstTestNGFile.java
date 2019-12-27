package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";

	 public WebDriver driver ; 
	 
	 @BeforeTest
     public void launchBrowser() {
		 System.out.println("launching IE browser"); 
        // System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
         
     	//String driverPath = "D:\\Automation\\chromedriver.exe";
     	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
         
   //	  driver = new InternetExplorerDriver();
   	  driver = new ChromeDriver();
   	  driver.get(baseUrl);
     }
		
  @Test
  public void verifyHomepageTitle() {
	 
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
           
  }
  @AfterTest
  public void terminateBrowser(){
      driver.close();
  }
}
