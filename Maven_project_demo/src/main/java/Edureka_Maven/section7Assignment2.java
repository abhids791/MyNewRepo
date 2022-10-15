package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class section7Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Abhijit Das");
		driver.findElement(By.name("email")).sendKeys("asfdsfs@hjsdnfdsf.sdfd");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("dfgdfgdfg");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement e = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(e);
		dropDown.selectByIndex(0);

		driver.findElement(By.name("bday")).sendKeys("30-04-1992");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().split("×")[1].trim(),"Success! The Form has been submitted successfully!.");


	}

}
