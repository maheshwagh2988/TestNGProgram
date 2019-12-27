package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class GmailLogin {
	
	WebDriver driver = new FirefoxDriver();
	
	public void login()
	{
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Email' and @name='Email']")).sendKeys("swapnil808");
		driver.findElement(By.xpath("//input[contains(@id,'Passwd')]")).sendKeys("Safe@2486");
		driver.findElement(By.xpath("//input[contains(@id,'signIn')]")).click();		
	}
	

	public static void main(String[] args) {
		
		GmailLogin gl = new GmailLogin();
		gl.login();

	}

}
