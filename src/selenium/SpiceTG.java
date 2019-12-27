package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceTG {

	
	WebDriver driver ;
	public void login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D://Automation//chromedriver_win32_76//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://spicetg.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.id("admin-email")).sendKeys("prasadn@leotechnosoft.net");
		driver.findElement(By.id("admin-password")).sendKeys("leo_12");
		driver.findElement(By.xpath("//button[@ng-click='spicelogin(email_txt,password_txt)']")).click();
		
		try{
		
		String Pagetext=driver.findElement(By.xpath("//div[@class='pageHead clearfix ng-scope']")).getText();
		
		//Thread.sleep(2000);
				
		 if(Pagetext.equalsIgnoreCase("Tenant Management"))
	        	
	        {

             
	        	//System.out.println("User has been Login with valid Details and the userName is: "+UserName);
	        	System.out.println("Test Case is PASSED");
				
	        	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				//Shp.LogoutDrpoDownArrow.click();
				//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				//driver.LogOutApplicaion.click();
	        }

	        else {
	        	//if(dr.switchTo().alert() == null) 
	        	
	        	//AlertHandel al= new AlertHandel();
	        	//al.isAlertPresent();
	        	
	        	Alert confirmationAlert = driver.switchTo().alert();
	        	String alertText = confirmationAlert.getText();
	        	System.out.println("Alert text is " + alertText);
	        	
	        	confirmationAlert.dismiss();
	        	driver.close();
	        	
	        	
	            }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		 Alert confirmationAlert = driver.switchTo().alert();
		 String alertText = confirmationAlert.getText();
		 System.out.println("Alert text is " + alertText);
		 confirmationAlert.dismiss();
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle profileToggle ng-scope']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']//a[text()='Logout']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.close();
		
		
	}
	

	public static void main(String[] args) throws Exception {
		
		SpiceTG gl = new SpiceTG();
		gl.login();

	}

}
