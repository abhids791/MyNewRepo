package Edureka_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow= it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		
	}

}
