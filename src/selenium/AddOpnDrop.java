package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddOpnDrop {

	public static void AddOptiond(WebDriver driver) {
		Select CqmTypes = new Select(driver.findElement(By.xpath("//select[@id='customSetting_CqmTypes_value']")));
		CqmTypes.selectByVisibleText("");
		
		Select ChFunTypes = new Select(driver.findElement(By.id("customSetting_EhFunctionalTypes_value")));
		ChFunTypes.selectByVisibleText("");
		
		Select CpFunTypes = new Select(driver.findElement(By.id("customSetting_EpFunctionalTypes_value")));
		CpFunTypes.selectByVisibleText("");
		
		driver.findElement(By.id("upd")).click();
	}

}
