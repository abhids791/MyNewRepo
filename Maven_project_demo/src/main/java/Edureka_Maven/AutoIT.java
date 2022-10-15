package Edureka_Maven;

import java.beans.Visibility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Project\\Maven_project_demo\\BrowserDriver\\chromedriver.exe");
		
		//Giving knowledge to Chrome the Download Path for the file.
		String downloadPath=System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
		
		//File Uploading
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.linkText("Select PDF file")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\abhid\\OneDrive\\Desktop\\AutoIT\\MyFirstUpload.exe");
		
		
		//File Downloading
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn--red")));
		
		driver.findElement(By.cssSelector("button.btn--red")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#pickfiles")));
		driver.findElement(By.cssSelector("a#pickfiles")).click();
		
		Thread.sleep(4000);
		File f=new File(downloadPath+"/fileToUpload.docx");
		if(f.exists()) {
			Assert.assertTrue(f.exists());
			System.out.println("File Present and is deleted");
			f.delete();
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
