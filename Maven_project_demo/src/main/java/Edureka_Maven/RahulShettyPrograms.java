package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyPrograms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("dkjhdjfg");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("sfdf");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sfsdfsdf");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("fssdfdf");
		driver.findElement(By.cssSelector("input[placeholder*='Phone']")).sendKeys("546132131");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String password=getPassword(driver);
		System.out.println(password);
		//System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector("button[class*=\"go\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Abhijit");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.cssSelector(".submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
		
	}
	public static String getPassword(WebDriver driver) {
		String a=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passwordArr= a.split("'");
		String[] e=passwordArr[1].split("'");
		return e[0];
	}
	

}
