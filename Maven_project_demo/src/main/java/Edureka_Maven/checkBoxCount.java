package Edureka_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//To find Number of CheckBox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//To find Text of ChheckBox
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']/parent::div/parent::div/div/label"));
		
		for(WebElement checkbox:checkboxes) {	
			System.out.println(checkbox.getText());
		}
		
	}

}
