package Edureka_Maven;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationIMplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Wait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		String[] productToAdd = { "Brinjal", "Brocolli", "Cucumber", "Cauliflower", "Beans", "Potato", "Walnuts" };
		
		// Changing to ArrayList
		System.out.println(productToAdd[0]);
		List productToAddList = Arrays.asList(productToAdd); 

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		
		int count = 0;

		for (int i = 0; i < products.size(); i++) {

			// Get Product ActualName
			String[] name = products.get(i).getText().split("-");
			String actualName = name[0].trim();

			if (productToAddList.contains(actualName)) {
				// driver.findElements(By.xpath("//h4[@class='product-name']/parent::div/div/button[@type='button']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				// Since Add To Card is Dynamic or not Static hence not preferred
				// driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				count++;
				if (count == productToAddList.size()) {
					break;
				}
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	}

}
