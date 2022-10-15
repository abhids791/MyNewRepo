package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main Running");
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\msedgedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		
		  
		
		  FirefoxDriver firedriver= new FirefoxDriver();
		  
		  firedriver.get("https://www.google.com/intl/en-GB/gmail/about/"); 
		  firedriver.findElement(By.xpath("//a[text()='Sign in']")).click();
		  
		 firedriver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys( "abhids788");
		 firedriver.findElement(By.xpath("//span[text()='Next']")).click();
		 System.out.println("Hi");
		 firedriver.quit();

		// firedriver.findElement(By.xpath("//span[text()='Couldn't find your Google
		// Account']"));

		// System.out.println(e);

		/*
		 * chromedriver.get("file:///C:/Users/abhid/OneDrive/Desktop/Demo2.html");
		 * chromedriver.findElement(By.xpath("/html/body/div/input[1]")).clear();
		 * chromedriver.findElement(By.xpath("/html/body/div/input[1]")).sendKeys(
		 * "Bombay");
		 * chromedriver.findElement(By.xpath("/html/body/div/input[2]")).sendKeys("LOL")
		 * ;
		 * chromedriver.findElement(By.xpath("//input[1]|//input[2]")).sendKeys("ASSAM")
		 * ; chromedriver.findElement(By.xpath("//input[2]")).sendKeys("Swit");
		 * chromedriver.findElement(By.xpath("//div[2]//input[1]")).sendKeys("jiii");
		 * chromedriver.findElement(By.xpath("//div[2]//input[2]")).sendKeys("Swit");
		 */

		Thread.sleep(5000);
		// chromedriver.close();
		/*
		 * System.out.println(chromedriver.getTitle());
		 * chromedriver.navigate().to("https://en.wiktionary.org/wiki/paper");
		 * Thread.sleep(5000); chromedriver.navigate().back(); Thread.sleep(5000);
		 * 
		 * 
		 * chromedriver.close();
		 */
		// firedriver.close();

	}

}