package Edureka_Maven;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class footerLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//Footer links  
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		//particular one column links
		WebElement firstColDriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstColDriver.findElements(By.tagName("a")).size());
		
		
		//Click on each link and check if links are opening
		
		for(int i=1; i<firstColDriver.findElements(By.tagName("a")).size();i++) {
			String CTRLClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			firstColDriver.findElements(By.tagName("a")).get(i).sendKeys(CTRLClick);
			
		}
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(driver.switchTo().window(it.next()).getTitle()); 
		}
		
		
		
		
		
	}

}
