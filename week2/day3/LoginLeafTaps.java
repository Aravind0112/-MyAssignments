package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLeafTaps {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Aravind");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select drop1=new Select(industry);
		drop1.selectByIndex(3);
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select drop2=new Select(ownership);
		drop2.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select drop3=new Select(source);
		drop3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement markcampid = driver.findElement(By.id("marketingCampaignId"));
        Select drop4 = new Select(markcampid);
        drop4.selectByIndex(6);
        
        
        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select drop5 = new Select(state);
        drop5.selectByValue("TX");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        
        
 //       driver.close();	
		
		
	}

}
