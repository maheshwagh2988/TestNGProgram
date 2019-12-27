package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleChkBoxDdown {
	
	WebDriver driver = new FirefoxDriver();
	
	public void chkbox(){
		driver.get("http://www.toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement manual = driver.findElement(By.xpath("//input[@id='profession-0']"));
		WebElement automation = driver.findElement(By.xpath("//input[@id='profession-1' and @value='Automation Tester']"));
		WebElement qtp = driver.findElement(By.xpath("//input[contains(@id,'tool-0')]"));
		WebElement ide = driver.findElement(By.xpath("//input[contains(@id,'tool-1')]"));
		WebElement Selwebdriver = driver.findElement(By.xpath("//input[contains(@id,'tool-2')]"));
		
		WebElement dropdown = driver.findElement(By.id("continents"));
		WebElement dropdownCommands = driver.findElement(By.id("selenium_commands"));		
		
		Select dropdownValue = new Select(dropdown);
		dropdownValue.selectByVisibleText("Australia");
		
		Select dropdownCommandsValue = new Select(dropdownCommands);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).build().perform();
		
		dropdownCommandsValue.selectByVisibleText("Browser Commands");
		dropdownCommandsValue.selectByVisibleText("Navigation Commands");
		dropdownCommandsValue.selectByVisibleText("Wait Commands");
		dropdownCommandsValue.selectByVisibleText("WebElement Commands");
		dropdownCommandsValue.deselectByVisibleText("Navigation Commands");
		
		
		if(!manual.isSelected()){
			manual.click();
		}
		
		if(!automation.isSelected()){
			automation.click();
		}
		
		if(!qtp.isSelected()){
			qtp.click();
		}
		
		if(!ide.isSelected()){
			ide.click();
		}
		
		if(!Selwebdriver.isSelected()){
			Selwebdriver.click();
		}
		
		if(qtp.isSelected()){
			qtp.click();
		}
	}
	
	public static void main (String args[]){
		MultipleChkBoxDdown cb = new MultipleChkBoxDdown();
		cb.chkbox();
	}

}
