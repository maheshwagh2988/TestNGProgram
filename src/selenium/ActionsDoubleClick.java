package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {
	
	WebDriver driver = new FirefoxDriver();
	
	public void doubleClick(){
		driver.get("https://mail.cognizant.com/owa");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("215565");
		driver.findElement(By.id("password")).sendKeys("Jun@2015");
		driver.findElement(By.xpath("//*[@id='mdMid']/table[1]/tbody/tr[7]/td/table/tbody/tr[3]/td/input[1]")).click();
		
		WebElement sender = driver.findElement(By.xpath("//span[@id='spnFrom']"));
		Actions builder = new Actions(driver);
		//builder.moveToElement(sender).doubleClick(sender).build().perform();
		builder.doubleClick(sender).build().perform();
	}
	
	public static void main (String args[]){
		ActionsDoubleClick  adc = new ActionsDoubleClick();
		adc.doubleClick();
	}

}
