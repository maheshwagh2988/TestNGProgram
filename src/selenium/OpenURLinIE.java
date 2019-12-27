package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
public class OpenURLinIE{
 
 public static void main(String[] args) {
  //Following code is to initialize the webdriver.
  WebDriver driver = null;
  
  //Following code is to locate the ie driver executable file.
  File IEDriver = new File("G:\\Swapnil\\JAVA\\Setup\\IEDriverServer\\IEDriverServer.exe");
  
  //Following code is to set the ie driver with webdriver property.
  System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath());
  
  //Following code is to initialize the ie driver.
  driver = new InternetExplorerDriver();
 
  driver.get("http://helloselenium.blogspot.com");
   
  driver.quit();
 }
 
}
