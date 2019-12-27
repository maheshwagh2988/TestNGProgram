package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class S1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		 Globalvariable.Globaldriver = new InternetExplorerDriver();
		 Globalvariable.Globaldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Globalvariable.Globaldriver.get("http://10.10.13.63:88/luna/PackageManagement");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	public static void Dropdown() {
		// TODO Auto-generated method stub
		
	}

}
