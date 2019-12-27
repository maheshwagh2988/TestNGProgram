package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JustDialXLSWrite {
	
	WebDriver driver = new FirefoxDriver();
	
	public void writeXLS(){
		driver.get("http://www.justdial.com");
		driver.manage().window().maximize();
		//WebElement dropDown = driver.findElement(By.xpath("//a[@id='ctlnk']"));
		//Select dropdownValue = new Select(dropDown);
		
		//dropdownValue.selectByVisibleText("Pune");
				
		driver.findElement(By.xpath("//input[@id='what']")).sendKeys("Veg Restaurent");
		driver.findElement(By.xpath("//button[@id='go']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//section[contains(@id,'bcard')]"));
		for(int n=0;n<ele.size()-1;n++){
			String arr[] = new String[n];
			arr[n] = ele.get(n).getText();
			System.out.println(arr[3]);
		}
	}
	
	public static void main (String args[]){
		JustDialXLSWrite jdxlw = new JustDialXLSWrite();
		jdxlw.writeXLS();
		
	}

}
