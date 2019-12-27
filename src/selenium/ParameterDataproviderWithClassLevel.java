package selenium;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ParameterDataproviderWithClassLevel {
	
	WebDriver driver;
	
	@BeforeTest
	 public void setup(){
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
	@Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
	public void testMethod(String author,String searchKey) throws InterruptedException{
		
		 WebElement searchText = driver.findElement(By.name("q"));
		//Search text in google text box
	        searchText.sendKeys(searchKey);
	       
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	     
	        Thread.sleep(3000);
	      //get text from search box
	        String testValue = searchText.getAttribute("value");
	        
	        System.out.println(testValue +"::::"+searchKey);
	        
	        searchText.clear();
	        //verify if search box has correct value
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}
	@AfterTest
	public void close(){
		driver.close();
	}
}
