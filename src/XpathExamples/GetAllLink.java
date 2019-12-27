package XpathExamples;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLink {
	
	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver_win32_77/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("http://f/juniper-sh-qa-f-25/");
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		driver.findElement(By.xpath("//option[text()='Books']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close(); */
		String url="";
		List <WebElement> AllLink=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Link  is "+AllLink.size());
		Iterator<WebElement> it=AllLink.iterator();
		while(it.hasNext())
		{
			url=it.next().getAttribute("href");
			String str=it.next().getText();
			System.out.println(url);
			System.out.println(str);
			
		if(url == null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty"+url);
				continue;
			}
		else if (str == null || str.isEmpty())
			{
				System.out.println("String anchor tag or it is empty"+str);
				continue;
			}
		}
		
		
		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		for(int i=0; i<AllLink.size(); i++){
//			System.out.println(AllLink.get(i).getText());
//			String Linktext=AllLink.get(i).getText();
//			System.out.println("Text Name of Link are: "+Linktext);
//		}
		driver.close();

	}

}
