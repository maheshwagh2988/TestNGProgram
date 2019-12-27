package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling1 {
	
	
	
	
	public void handle(){

		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.popuptest.com/");
		driver.manage().window().maximize();
		
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
		Set<String> handler = driver.getWindowHandles();
		
		for(String winhandle : handler){
			driver.switchTo().window(winhandle);
			String var = driver.getTitle();
			System.out.println(var);
			
			
			
		}
		
	}
	
	
	public static void main (String args[]){
		WindowsHandling1 whl = new WindowsHandling1();
		whl.handle();
	}

}
