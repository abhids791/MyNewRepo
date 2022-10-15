package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class section11Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		// Click on CheckBox2
		driver.findElement(By.id("checkBoxOption2")).click();

		// Copy the Check Box Text
		String textTOEnter = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");

		// Select the Dropdown option what is copied
		WebElement e = driver.findElement(By.id("dropdown-class-example"));
		Select options = new Select(e);
		options.selectByValue(textTOEnter);

		// Paste the value in text Box
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(textTOEnter);
		driver.findElement(By.id("alertbtn")).click();

		// Verify the text displayed is present on the Alert
		Assert.assertEquals(driver.switchTo().alert().getText().split(" ")[1].split(",")[0], textTOEnter);
		driver.switchTo().alert().accept();

	}

}
