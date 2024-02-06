 	package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");		
		//		FirefoxDriver driver=new FirefoxDriver();
		//		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the window
		driver.manage().window().maximize();							

		//find the element and enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		//To check whether the page is loading or not
		String title = driver.getTitle();
		if(title.contains("My Leads | opentaps CRM")) {
			System.out.println("Page is loaded");
		}
		else {
			System.out.println("Page not loaded");

		}	
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println(driver.getTitle());
		//Click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//to retrieve the value of company name
		String attribute = driver.findElement(By.id("createLeadForm_companyName")).getAttribute("name");
		System.out.println(attribute);
		
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
		//Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("JA");
		//to handle dropdown
		//locating the dropdown element then return as a web element
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Create Object for select class
		Select drop1 = new Select(source);  //Select constructor need some arg so passing web element..ie source
		//we can use methods to select specific options
		//		drop.selectByIndex(3);		// get by index value
		//drop.selectByValue("LEAD_EMPLOYEE"); 		//get by value
		//		drop.selectByVisibleText("Existing Customer"); //get by visible text 

		drop1.selectByIndex(3);
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select(campaign);
		drop2.selectByVisibleText("Automobile");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3 = new Select(ownership);
		drop3.selectByValue("OWN_CCORP");

		//Click create lead button
		driver.findElement(By.name("submitButton")).click();

		//Close the Window
		//		driver.close();													
	}

}
