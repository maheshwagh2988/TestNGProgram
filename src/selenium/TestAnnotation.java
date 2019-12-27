package selenium;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;



public class TestAnnotation {
	
	public WebDriver driver;
	
  @Test
  public void EnterString() {
	  driver.findElement(By.id("sb_ifc0")).sendKeys("selenium");
	  System.out.println("@Test method call @BeforeMethod");
  }
  
  @Test
  public void Number() {
	  driver.findElement(By.id("sb_ifc0")).sendKeys("Mahesh");
	  System.out.println("@Test method call @BeforeMethod");
  }
  
  @BeforeMethod
  public void LaunchBrowser() {
	  	  
	  //File file = new File("D:/Automation/IEDriverServer.exe");
	  System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	  System.out.println("@BeforeMethod method call before each @Test Method");
	  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("@AfterMethod method call after all @Test Method");
  }
  
  
  @BeforeSuite
  public void beforeSuite1() {
      System.out.println("TestA: beforeSuite1");
  }
   
  @BeforeSuite
  public void beforeSuite2() {
      System.out.println("TestA: beforeSuite2");
  }
   
  @BeforeTest
  public void beforeTest(ITestContext testContext) {
      System.out.println("TestA: beforeTest Test<" + testContext.getName() + ">");
  }
   
  @BeforeClass
  public void beforeClass() {
      System.out.println("TestA: beforeClass");
  }    
   
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("TestA: beforeMethod");
  }
   
  @Test
  public void unitTest1A() {
      System.out.println("TestA: unitTest1A");
  }
   
  @Test(groups="feature1")
  public void unitTest2A() {
      System.out.println("TestA: unitTest2A, feature1 test");
  }    
   
  @Test
  public void unitTest3A() {
      System.out.println("TestA: unitTest3A");
  }
   
  @Test(groups="feature2")
  public void unitTest4A() {
      System.out.println("TestA: unitTest4A, feature2 test");
  }    
   
  @AfterMethod
  public void afterMethod1() {
      System.out.println("TestA: afterMethod");
  }
   
  @AfterClass
  public void afterClass() {
      System.out.println("TestA: afterClass");
  }
   
  @AfterTest
  public void afterTest(ITestContext testContext) {
      System.out.println("TestA: afterTest Test<" + testContext.getName() + ">");
  }
   
  @AfterSuite
  public void afterSuite() {
      System.out.println("TestA: afterSuite");
  }

}
