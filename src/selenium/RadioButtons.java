package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {
	
	WebDriver driver = new FirefoxDriver();
	
	public void radioButtons(){
		driver.get("http://epaperbeta.timesofindia.com/");
		driver.manage().window().maximize();
		
		WebElement EconomicTimes = driver.findElement(By.xpath("//input[@id='rbtnList_2']"));
		
		//if(!EconomicTimes.isSelected())
		//	EconomicTimes.click();
		
		WebElement table = driver.findElement(By.id("rbtnList"));
		List<WebElement> radioButton = table.findElements(By.tagName("td"));
		System.out.println(radioButton.size());
		/*for(WebElement webelement : radioButton)
		{
			System.out.println(webelement.getText());
			if(webelement.getText().equals("The Economic Times")){
				if(!EconomicTimes.isSelected())
					EconomicTimes.click();
				break;
			}
		}*/
		
		for(int i=1;i<=radioButton.size();i++){
			List<WebElement> rbtn = driver.findElements(By.xpath("//input[@id='rbtnList_"+i+"']"));
			if(rbtn.contains(EconomicTimes)){
				if(!EconomicTimes.isSelected())
					EconomicTimes.click();
				break;
			}
		}
		assert(EconomicTimes.isSelected());
	}
	
	
	public static void main (String args[]){
		RadioButtons rb = new RadioButtons();
		rb.radioButtons();
	}

}
