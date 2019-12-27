package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class DesiredCapabilitiesIE{
 
 public static void main(String[] args) {
 
  WebDriver driver = null;
 
  File IEDriver = new File("G:\\Swapnil\\JAVA\\Setup\\IEDriverServer\\IEDriverServer.exe");
  System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath());  
  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
  capabilities.setCapability(InternetExplorerDriver.
  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
  driver = new InternetExplorerDriver(capabilities);
 
  driver.get("https://gmail.com");
   
  driver.quit();
 }
 
}

/*
*Following code is to initialize the webdriver.
WebDriver driver = null;

*Following code is to locate the ie driver executable file.
File IEDriver = new File("path of the IEDriverServer (.exe file)");

*Following code is to set the ie driver with webdriver property.
System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath() ); 

*Following code is to define Internet Explorer capability.
DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

*Following code is to set Internet Explorer capability.
capabilities.setCapability(InternetExplorerDriver.
INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

*Following code is to initialize the ie driver.
driver = new InternetExplorerDriver(capabilities);

*Following code is to open the hello selenium blog in ie browser.
driver.get("http://helloselenium.blogspot.com");

*/