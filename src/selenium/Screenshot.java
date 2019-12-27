package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	WebDriver driver = new FirefoxDriver();
	
	public void loginToGmail() throws Exception{
		try{
			driver.get("https://gmail.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='Emai' and @name='Email']")).sendKeys("swapnil808");
			driver.findElement(By.xpath("//input[contains(@id,'Passwd')]")).sendKeys("Safe@2486");
			driver.findElement(By.xpath("//input[contains(@id,'signIn')]")).click();
		}
		catch(Exception e){
			System.out.println("Exception occured "+e);
			takeScreenshot();
		}
		finally{
			driver.close();
		}
	}
	
	public void takeScreenshot() {
		try{
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("G:\\Swapnil\\JAVA\\SeleniumScreenshots\\sample2.png"));
		}
		catch(Exception e){
			System.out.println("Exception occured while taking ScreenShots. "+e);
		}
	}
	
	
	
	public static void main (String args[]) throws Exception{
		Screenshot ss = new Screenshot();
		ss.loginToGmail();
	}

}
