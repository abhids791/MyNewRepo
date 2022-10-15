package Edureka_Maven;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class javaStreamSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> products= driver.findElements(By.cssSelector(".mb-3"));
		products.stream().filter(product -> product.findElement(By.xpath("//b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		
		
		List<WebElement> veggies=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		
		List<String>WebPageVeggie= veggies.stream().map(s-> s.getText()).collect(Collectors.toList());
		List<String>WebPageSortedVeggie=veggies.stream().map(s-> s.getText()).sorted().collect(Collectors.toList());
		
		for(String a:WebPageSortedVeggie) {
			System.out.println(a);
		}
		Assert.assertTrue(WebPageVeggie.equals(WebPageSortedVeggie));
		
		
		//Scan the name column and if Rice present, print the Price
		List<String> price= veggies.stream().filter(s-> s.getText().contains("Beans")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		for(String c:price) {
			System.out.println(c);
		}
		
		
		

	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
