package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class staticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement e= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		Select dropDown =new Select(e);
		for(int i=0; i<=3;i++)
		{
			dropDown.selectByIndex(i);
			System.out.println(dropDown.getFirstSelectedOption().getText());
		}
		dropDown.selectByIndex(0);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("INR");
		dropDown.selectByValue("AED");
		
		
		//Since value not present hence error
		//dropDown.selectByValue("Select"); 
		
		dropDown.selectByVisibleText("Select");
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		 		
	}

}
