//package pageObjects;
//
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class LoginLuna {
//
//	WebDriver driver;
//	
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("http://ms-luna-test2/PackageManagement");
//		
//		if(driver.getTitle().contains("Luna :: Manage Packages"))
//		    //Pass
//		    System.out.println("Page title contains \"Luna :: Manage Packages\" ");
//		else 
//		    //Fail
//		    System.out.println("Page title doesn't contains \"Luna :: Manage Packages\" ");
//		
//		//Verify the Package Management Title for this used getPageSource() method
//		
//		if (driver.getPageSource().contains("Package Managment"))
//			//Pass 
//		System.out.println("Page title contains \"Package Managment\" ");
//		else
//			 System.out.println("Page title doesn't contains \"Package Managment\" ");
//		
////		Select drop down = new Select(driver.findElement(By.xpath("//select[@id='ClientId']")));
////		//dropdown.deselectByIndex(90);
////		//dropdown.selectByValue("centurastc-ks-01");
////		dropdown.selectByVisibleText("civista-md-01");
//		
//		ReadandWriteExcel RD = new ReadandWriteExcel();
//	//	XSSFSheet excel= RD.GetExcelSheet("d://Automation//TestData.xlsx");
//		
//		// new added 05/13/2013
////		XSSFSheet excel= RD.GetExcelSheet("d://Automation//TestData.xlsx",0);
////		XSSFSheet excel1= RD.GetExcelSheet("d://Automation//TestData.xlsx",1);
//		
//		
//		
////		int cid=0,Eid=1,Aid=2,Pid=3;
////		
////		for (int i=1; i <= excel.getLastRowNum(); i++){
////			 
////			PkgMngDrop.ProcessPackages(driver
////					,excel.getRow(i).getCell(cid).getStringCellValue()
////					, excel.getRow(i).getCell(Eid).getStringCellValue()
////					, excel.getRow(i).getCell(Aid).getStringCellValue()
////					, excel.getRow(i).getCell(Pid).getStringCellValue());
////	       	 
////	}
////		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		// Select Client Drop down
////		Select Cdropdown = new Select(driver.findElement(By.xpath("//select[@id='ClientId']")));
////		List <WebElement> elementCount = Cdropdown.getOptions();
////		Thread.sleep(2000);
////		System.out.println(elementCount.size());
////		int iSize = elementCount.size();
////				
////		Cdropdown.selectByVisibleText("civista-md-01");
////		
////		Thread.sleep(2000);
////		//Select Destination Drop down
////		Select Edropdown = new Select(driver.findElement(By.id("EnvironmentId")));
////		
////		//Edropdown.selectByVisibleText("civista-prod-m-01");
////		
////		Thread.sleep(1000);
////		//Select Agent Dropdown
////		Select Adropdown = new Select(driver.findElement(By.xpath("//select[@id='AgentId']")));
////		//Adropdown.selectByVisibleText("civista-mdb-01");
////		
////		//Select Product dropdown
////		Thread.sleep(1000);
////		Select Pdropdown = new Select(driver.findElement(By.xpath("//select[@id='ProductId']")));
//		//Pdropdown.selectByVisibleText("ENCOR eMeasures");
//		//Thread.sleep(1000);
//		// Click on select Package Button 
//		
//		
//		
//		
//		}
//
//}
