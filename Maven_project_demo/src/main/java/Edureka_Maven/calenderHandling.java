package Edureka_Maven;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//p[@data-cy='departureDay']")).click();
		int count = 0;

		while (!driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[1]/div")).getText().contains("October")) {
			if (driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[1]/div")).getText().contains("September")) {
				break;
			}
			System.out.println("Outer");

			while (!driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[2]/div[1]/div")).getText().contains("October")) {
				if (driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[2]/div[1]/div")).getText().contains("October")) {
					break;
				}
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}

		}
		List<WebElement> days = driver.findElements(By.cssSelector(".DayPicker-Day div p"));
		System.out.println(days.size());
		for (int i = 0; i < days.size(); i++) {
			System.out.println(i);
			if (days.get(i).getText().contains("15")) {

				// System.out.println(days.get(i).getText().contains("9"));
				days.get(i).click();
				break;
			}
		}
	}
	

	
	
	
	
	
}