package Edureka_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class section7Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		if(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()== true)
			System.out.println("CheckBox Selected");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		if(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()==false)
			System.out.println("CheckBox Unchecked");
		
		//2. How to get the Count of number of check boxes present in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
