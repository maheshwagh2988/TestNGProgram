package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown1 {
	
	WebDriver driver = new FirefoxDriver();
	
	public void selectFromDropdown(){
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement parent = driver.findElement(By.className("matchParent content"));
	}
	
	
	public static void main (String args[]){
		Dropdown1 dd1 = new Dropdown1();
		dd1.selectFromDropdown();
	}

}
