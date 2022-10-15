package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class spicejetFlightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		
		//Check Return Field Disabled or Enabled
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"), false);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"), true);
		
		//Source Destination Selection
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click(); //Important
		
		//Journey Date Selection
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		//Passenger count
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=0; i<=5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Search
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.quit();
		
		//a[@value='BLR'][1]
		//a[@value='BLR'][1]
		
		//For SpeceJet
//		driver.findElement(By.cssSelector("//div[@data-testid='one-way-radio-button']/following-sibling::div[1]")).click();
//		////div[text()='Kempegowda International Airport']
	}

}
