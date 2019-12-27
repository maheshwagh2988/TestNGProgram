package selenium;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {
	
	
	public void scroll() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Scroll Down
		jse.executeScript("scroll(0, 400)");
		Thread.sleep(1000);
		//Scroll Up
		jse.executeScript("scroll(250, 0)");
		Thread.sleep(1000);
		//Scroll to Bottom of Page
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
		
		/*Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();*/
	}
	
	
	public static void main (String args[]) throws Exception{
		ScrollPage sp = new ScrollPage();
		sp.scroll();
	}

}

