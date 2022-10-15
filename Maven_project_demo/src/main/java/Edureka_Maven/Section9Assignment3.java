package Edureka_Maven;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Fluent Wait also can be used  .ignoring(NoSuchElementException.class)
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		String userName, password;
		userName=driver.findElement(By.xpath("//i[text()='rahulshettyacademy']")).getText();
		password=driver.findElement(By.xpath("//i[text()='learning']")).getText();
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span")).click(); //llll
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-success")));
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		WebElement e= driver.findElement(By.xpath("//select[@class='form-control']"));
		Select options =new Select(e);
		options.selectByValue("consult");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
		
		List<WebElement> addButtons= driver.findElements(By.cssSelector(".btn-info"));
		
		for(WebElement button:addButtons) {
			
			button.click();
		}
		
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
	}

}
