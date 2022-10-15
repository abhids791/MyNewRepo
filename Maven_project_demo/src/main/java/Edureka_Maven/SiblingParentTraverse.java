package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingParentTraverse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("html/body/header/div/button[1]")).click();
		driver.findElement(By.xpath("html/body/header/div/button[1]/following-sibling::button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/header/div/button[1]/following-sibling::button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/header/div/button[1]/following-sibling::button[1]/parent::div/button[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Practice\"]/following-sibling::button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()=\"Practice\"]/following-sibling::button[2]")).click();
	}

}
