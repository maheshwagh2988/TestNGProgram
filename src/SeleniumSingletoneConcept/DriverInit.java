package SeleniumSingletoneConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
	//Create instanceDriver Instance/Object type of DriverInit class and make it as null
	private static DriverInit instanceDriver=null;
	//declare private Variable
	private WebDriver driver;
	//Creat Private Constructor of this class
	private DriverInit(){
		
	}
	//Create OpenBrower Method 
	public WebDriver openBrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	//Create getInstanceMethod and will return DriverInit 
	public static DriverInit getInstance(){
		if(instanceDriver==null)
			instanceDriver= new DriverInit();
		return instanceDriver;
		
	}

}
