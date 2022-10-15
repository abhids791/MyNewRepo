package Edureka_Maven;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("[id='search-field']")).sendKeys("i");
		
		
		List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> newRow=rows.stream().filter(s->s.getText().contains("i")).map(s->s.getText().toLowerCase()).collect(Collectors.toList());
				
		
		Assert.assertEquals(rows.size(), newRow.size());
	}

}
