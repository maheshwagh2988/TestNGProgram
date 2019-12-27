package XpathExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OCP_Schedule_Make_OffCall {
	@SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception
    {
//         // TODO Auto-generated method stub
//         
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_75/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        String url;
           
           driver.manage().window().maximize();
           url = "https://kemhospital.oncallpeople.com";
           driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
           driver.get(url);
           
           driver.findElement(By.xpath("//*[@id=\"dnn_ctr15761_SignIn_txtEmpolyeeId\"]")).sendKeys("kemhospital");
           driver.findElement(By.xpath("//*[@id=\"dnn_ctr15761_SignIn_txtPassword\"]")).sendKeys("P@ssw0rd");
           
           driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//*[@id=\"dnn_ctr15761_SignIn_btnSignIn\"]")).click();
           driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
           
           driver.findElement(By.xpath("//*[@id=\"tbldnn_dnnSOLPARTMENU1_ctldnnSOLPARTMENU1MenuBar\"]/li[3]/a/span[1]")).click();
           driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//*[@id=\"tbldnn_dnnSOLPARTMENU1_ctldnnSOLPARTMENU1MenuBar\"]/li[3]/ul/li[1]/a[2]/span")).click();
           driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
           
           //To select the group in group drop down
           driver.findElement(By.xpath("//*[@id=\"dnn_ctr15768_CalendarView_ddlGroup\"]")).click();
           driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//*[@id=\"dnn_ctr15768_CalendarView_ddlGroup\"]/option[5]")).click();
           
           driver.findElement(By.xpath("//div[@class='CallIconLeft CallIcon']//parent::div[@style='    float: left;width: 25px;']//parent::div[@class='fc-title fc-day']//child::div[contains(@style,'ECBFFF')]")).click();
           driver.findElement(By.xpath("//div[@class='CallIconLeft CallIcon']//parent::div[@style='    float: left;width: 25px;']//parent::div[@class='fc-title fc-day']//child::div[contains(@style,'FFE799')]")).click();
           driver.findElement(By.xpath("//div[@class='CallIconLeft CallIcon']//parent::div[@style='    float: left;width: 25px;']//parent::div[@class='fc-title fc-day']//child::div[contains(@style,'B0FFEA')]")).click();


    }
}
