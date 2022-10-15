package Edureka_Maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptScrollProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  driver.manage().window().maximize();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  JavascriptExecutor js =(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)");
		  
		  Thread.sleep(5000);
		  js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		  
		  List<WebElement>
		  values=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"))
		  ; int sum=0; for(WebElement amount: values) { int
		  am=Integer.parseInt(amount.getText()); sum=sum+am; System.out.println(sum); }
		 
		  
	}

}
