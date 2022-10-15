package Edureka_Maven;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		List<String> price;
		
		
		do{
			List<WebElement> veggies=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price= veggies.stream().filter(s-> s.getText().contains("Cherry")).map(s->getVeggiePrice(s)).collect(Collectors.toList());

			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
		}
		while(price.size()<1);
		price.stream().forEach(s->System.out.println(s));
	}
	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
