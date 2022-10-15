package Edureka_Maven;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartAddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		String[] productToAdd = { "Brinjal", "Brocolli", "Cucumber", "Cauliflower", "Beans", "Potato", "Walnuts" };
		// Changing to ArrayList
		
		System.out.println(productToAdd[0]);
		List productToAddList = Arrays.asList(productToAdd); 

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		Thread.sleep(3000);
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
	}
}
