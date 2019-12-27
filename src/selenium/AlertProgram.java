package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class AlertProgram {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		
		//Alert Class with Simple Alert
		Alert simpleAlert= driver.switchTo().alert();
		Thread.sleep(5000);
		String AlertText=simpleAlert.getText();
		System.out.println("Alert Text is "+AlertText);
		simpleAlert.accept();
		
		//Alert Class with Confermation_Alert
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText);
		confirmationAlert.dismiss();
		
		//Alert Class with Prompt_alert_Text
		driver.findElement(By.xpath(".//*[@id='content']/p[11]/button")).click();
		Alert promptAlert  = driver.switchTo().alert();
		Thread.sleep(5000);
		String PromtalertText = promptAlert.getText();
		System.out.println("Alert text is " + PromtalertText);
		
		//Send some text to the alert 
		promptAlert .sendKeys("Accepting the alert");
		Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		promptAlert .accept();
	}
		
}
