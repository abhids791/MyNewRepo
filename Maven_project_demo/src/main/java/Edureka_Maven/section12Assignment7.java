package Edureka_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class section12Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert a= new SoftAssert();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		
		  /*WebElement table=driver.findElement(By.id("product"));
		  System.out.println(table.findElements(By.tagName("tr")).size());
		  System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(
		  By.tagName("th")).size());
		  
		  List<WebElement>
		  secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName
		  ("td")); System.out.println(secondrow.get(0).getText());
		  System.out.println(secondrow.get(1).getText());
		  System.out.println(secondrow.get(2).getText()); }
		 */

		
		  List<WebElement>
		  rows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		  System.out.println("Rows Present: "+rows.size());
		  
		  List<WebElement> cols=
		  driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		  System.out.println("Colums present: "+cols.size());
		  
		  for(int i=1; i<rows.size();i++) { 
			  for(int j=0;j<cols.size();j++) {
				  System.out.println(rows.get(i).findElements(By.tagName("td")).get(j).getText());
				  }
		  }
		 
	}

}
