package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PkgMngDrop {

	public static void ProcessPackages(WebDriver driver,String clientId,String EnvId,String AgentId,String ProdId) throws InterruptedException{
		//System.out.println(clientId +EnvId+AgentId+ProdId);

		
		Select Cdropdown = new Select(driver.findElement(By.xpath("//select[@id='ClientId']")));
		List <WebElement> elementCount = Cdropdown.getOptions();
		Thread.sleep(2000);
		System.out.println(elementCount.size());
		int iSize = elementCount.size();
		
		Cdropdown.selectByIndex(3);
		
		Thread.sleep(3000);
		
		Cdropdown.selectByIndex(5);
		
		Thread.sleep(3000);
		
		Cdropdown.selectByVisibleText(clientId);
		
		
		Select mydrpdwn = new Select(driver.findElement(By.id("EnvironmentId")));
	    mydrpdwn.selectByVisibleText(EnvId);
	    

		Thread.sleep(1000);
		//Select Agent Dropdown
		Select Adropdown = new Select(driver.findElement(By.xpath("//select[@id='AgentId']")));
		Adropdown.selectByVisibleText(AgentId);
		
		//Select Product dropdown
		//Thread.sleep(3000);
		
		Select Pdropdown = new Select(driver.findElement(By.id("ProductId")));
		Thread.sleep(3000);
		Pdropdown.selectByVisibleText("Select a product");
		Thread.sleep(3000);
		Pdropdown.selectByVisibleText(ProdId);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
}
