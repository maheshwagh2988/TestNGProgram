package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	WebDriver driver = new FirefoxDriver();
	
	public void selectFromRadioBtn(){
		driver.get("http://epaperbeta.timesofindia.com/");
		driver.manage().window().maximize();
		
		WebElement EconomicTimes = driver.findElement(By.xpath("//input[@id='rbtnList_2']"));
		//EconomicTimes.click();
		
		WebElement table = driver.findElement(By.id("rbtnList"));
		List<WebElement> rdBtn = table.findElements(By.tagName("td"));
		for(WebElement webelement : rdBtn){
			System.out.println(webelement.getText());
			if(webelement.getText().equals("The Economic Times")){
				webelement.click();
				//if(!EconomicTimes.isSelected())
					//EconomicTimes.click();
			}
		}
	}
	
	public void selectFromDropdown(){
		
		WebElement dropdow = driver.findElement(By.id("ddlEditions"));
		Select dropdownValue = new Select(dropdow);
		
		dropdownValue.selectByIndex(3);
		dropdownValue.selectByValue("31817_Publications/TheEconomicTimes/Kolkata");
		dropdownValue.selectByVisibleText("Bangalore");		
	}
	
	
	public static void main (String args[]){
		Dropdown dd = new Dropdown();
		dd.selectFromRadioBtn();
		dd.selectFromDropdown();
	}

}
