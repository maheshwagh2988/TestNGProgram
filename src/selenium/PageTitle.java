package selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageTitle {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String ActualPage ; //Create Variable for ActualPage page
		
		driver.get("http://10.10.13.63:88/luna/PackageManagement/");
		
		ActualPage = driver.getTitle();
		
		System.out.println("Actula page Titile "+ActualPage);
		
		Assert.assertTrue(ActualPage.contains("Luna :: Manage Packages"));

				
	}

}
