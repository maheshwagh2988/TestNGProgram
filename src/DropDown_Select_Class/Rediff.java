package DropDown_Select_Class;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class Rediff {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.rediff.com/");
		//driver.findElement(By.xpath("//a[contains(.,'Create a Rediffmail account')] ")).click();
		driver.findElement(By.xpath("//a[contains(@href,'details')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@type,'text')][starts-with(@name,'name')]")).sendKeys("Mahesh");
		
		driver.findElement(By.xpath("//input[starts-with(@type,'text')][contains(@name,'login')]")).sendKeys("maheshwagh27");
		
		driver.findElement(By.xpath("//input[starts-with(@type,'password')][starts-with(@name,'passwd')]")).sendKeys("alishamahesh");
		
		driver.findElement(By.xpath("//input[starts-with(@type,'password')][contains(@name,'con')]")).sendKeys("alishamahesh");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Select mbdropdown = new Select(driver.findElement(By.xpath("//select[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")));
		mbdropdown.selectByVisibleText("India (+91)");
		
		WebElement countrydropdown=driver.findElement(By.id("country_id"));
	    Select country=new Select(countrydropdown);
	    country.selectByVisibleText("India (+91)");
		
		WebElement countryUL= driver.findElement(By.xpath("//[@id='country_id']/ul"));
		List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
		for (WebElement li : countriesList) {
		if (li.getText().equals("India (+91")) {
		     li.click();
		   }
		}
		
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mobno'][@type='text'][contains(@name,'mobno')]")).sendKeys("12346587");	
		driver.findElement(By.xpath("//input[@type='text'][@value=''][starts-with(@name,'verificationcode')]")).sendKeys("asd");
		
		Select Ddropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_D')]")));
		Ddropdown.selectByValue("29");
		
		Select Mdropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_M')]")));
		Mdropdown.selectByVisibleText("SEP");
		
		Select Ydropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Y')]")));
		Ydropdown.selectByVisibleText("1988");
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='m']")).click();
		
		Select Countrydropdown = new Select(driver.findElement(By.xpath("//select[@id='country'][contains(@name,'country')]")));
		Countrydropdown.selectByVisibleText("India");
		
		
		Select citydropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'city')]")));
		citydropdown.selectByVisibleText("Pune");
		
		
	}

}
