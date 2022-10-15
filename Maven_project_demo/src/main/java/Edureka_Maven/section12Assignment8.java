package Edureka_Maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class section12Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		
		/*
		 * driver.get("http://qaclickacademy.com/practice.php");
		 * 
		 * driver.findElement(By.id("autocomplete")).sendKeys("ind");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		 * 
		 * driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		 * 
		 * System.out.println(driver.findElement(By.id("autocomplete")).getAttribute(
		 * "value"));
		 */
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("indi");
		
		
		List<WebElement> options= driver.findElements(By.xpath("//span/b"));

		for(WebElement option: options) {
			//System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("a news")) {
				option.click();
				break;
			}
		}
		Assert.assertEquals(driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).getAttribute("value"), "india news");

	}

}
