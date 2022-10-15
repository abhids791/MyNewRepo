package Edureka_Maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class canlenderSimpleHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//p[@data-cy='departureDay']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[1]")).getText().contains("Dec")) {
			  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 }
		
		List<WebElement> days=driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[2]/div[3]/div/div/div"));
		for(int i=0; i<days.size();i++) {
			if(days.get(i).getText().contains("11")) {
				System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[1]")).getText());
				days.get(i).click();
				break;
			}
		}
		
	
		
	}

}
