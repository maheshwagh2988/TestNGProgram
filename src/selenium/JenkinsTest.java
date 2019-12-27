package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JenkinsTest {
	
	WebDriver driver = null;
	
	@Before
	public void setup() throws Exception{
		
		driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void loginToMail(){
		driver.findElement(By.xpath("//input[@id='logi-username']")).sendKeys("swapnil_808");
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Safe@2486");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	}
	
	
	@After
	public void tearDown() throws Exception{
		Thread.sleep(9000);
		driver.quit();
	}

}
