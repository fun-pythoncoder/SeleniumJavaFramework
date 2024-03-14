package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest_ExtentReports {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    ExtentTest test1 = extent.createTest("GoogleSearch", "This is to validate google search functionality");
	  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Testcase");
		driver.get("https://google.com");
		test1.pass("Navigated to google page");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		test1.pass("Entered text in searchbox");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("got search results");
		
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		System.out.println("Test completed successfully");
		test1.info("Test completed");
		
		extent.flush();
				
	}

}
