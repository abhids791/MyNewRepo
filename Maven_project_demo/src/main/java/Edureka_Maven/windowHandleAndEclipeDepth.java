package Edureka_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleAndEclipeDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> window= driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentWindow=it.next();
		
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		
		String emailID=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);
		
		
	}

}
