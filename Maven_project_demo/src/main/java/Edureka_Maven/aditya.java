package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class aditya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Aditya");
		driver.findElement(By.name("email")).sendKeys("adishukla91@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("adi@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement e=driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(e);
		gender.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("13/06/1991");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().split("×")[1].trim(),"Success! The Form has been submitted successfully!.");


	}

}
