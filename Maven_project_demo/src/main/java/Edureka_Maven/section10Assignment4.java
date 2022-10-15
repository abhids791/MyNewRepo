package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section10Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		//By FrameName
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		driver.switchTo().defaultContent();
		
		//By Locator
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		driver.switchTo().defaultContent();
		
		//By Index
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		
	}

}
