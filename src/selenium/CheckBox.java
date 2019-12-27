package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
	
	WebDriver driver = new FirefoxDriver();
	
	public void selectCheckbox(){
		driver.get("http://www.toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement CheckBoxManualTester = driver.findElement(By.xpath("//input[@id='profession-0' and @value='Manual Tester']"));
		WebElement CheckBoxAutomationTester = driver.findElement(By.xpath("//input[@id='profession-1' and @value='Automation Tester']"));
		WebElement Qtp = driver.findElement(By.xpath("//input[@id='tool-0' and @value='QTP']"));
		WebElement Ide = driver.findElement(By.xpath("//input[@id='tool-1' and @type='checkbox']"));
		WebElement Webdriver = driver.findElement(By.xpath("//input[@id='tool-2' and @value='Selenium Webdriver']")); 
		
		if(!CheckBoxManualTester.isSelected())
			CheckBoxManualTester.click();
		
		if(!CheckBoxAutomationTester.isSelected())
			CheckBoxAutomationTester.click();
		
		if(!Qtp.isSelected())
			Qtp.click();
		
		if(!Ide.isSelected())
			Ide.click();
		
		if(!Webdriver.isSelected())
			Webdriver.click();
		
		if(Qtp.isSelected())
			Qtp.click();       // This will deselect already checked QTP checkbox in above step.
		
	}
	
	public static void main (String args[]){
		CheckBox cb = new CheckBox();
		cb.selectCheckbox();
	}
}
