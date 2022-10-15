package Edureka_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//li[class='ui-menu-item'] a
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("in");
		Thread.sleep(4000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option: options) {
			System.out.println(option.getText());
		}
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("INDIA"))
				option.click();
		}
	}

}
