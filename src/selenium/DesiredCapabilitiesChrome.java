package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class DesiredCapabilitiesChrome{
 
 public static void main(String[] args) {
 
  WebDriver driver = null;
 
  File chromeDriver = new File("G:\\Swapnil\\JAVA\\Setup\\chromedriver.exe");
  System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath() );    
  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
  capabilities.setCapability(ChromeOptions.CAPABILITY, true);
  driver = new ChromeDriver();
 
  driver.get("https://gmail.com");
  driver.manage().window().maximize();   
  driver.quit();
 }
 
}
