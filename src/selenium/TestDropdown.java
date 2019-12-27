package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class TestDropdown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		
		//Create an instance for webdribver 
		WebDriver driver = new InternetExplorerDriver();
		//Launch Webdriver
		driver.get("http://10.10.13.63:88/luna/PackageManagement/");
		
		// Step 3: Select 'Continents' Drop down ( Use Id to identify the element )
		// Find Select element of "Single selection" using ID locator.
		
		Select oSelect = new Select(driver.findElement(By.xpath("//select[@id='ClientId']")));
		oSelect.selectByVisibleText("centralpen-ak-01");
		Thread.sleep(1000);
		
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		
		for(int i=0;i<iListSize;i++){
			
		}
		
		

	}

}
