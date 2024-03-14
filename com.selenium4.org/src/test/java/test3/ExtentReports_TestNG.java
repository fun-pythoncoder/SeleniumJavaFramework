package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReports_TestNG {
	
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		htmlReporter = new ExtentHtmlReporter("extentReports.html");
		extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    
	 	
	}
	

	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
	}
	
	@Test
	public void GoogleSearchSel() {
	
		ExtentTest test1 = extent.createTest("GoogleSearch Sel", "This is to validate google search functionality");
		test1.log(Status.INFO, "Starting Testcase");
		driver.get("https://google.com");
		test1.pass("Navigated to google page");
		
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		test1.pass("Entered text in searchbox");
		
	}
	
	@Test
	public void GoogleSearchJava() {
		
		ExtentTest test1 = extent.createTest("GoogleSearch Java", "This is to validate google search functionality");
		test1.log(Status.INFO, "Starting Testcase");
		driver.get("https://google.com");
		test1.pass("Navigated to google page");
		
		driver.findElement(By.name("q")).sendKeys("Java" + Keys.ENTER);
		test1.pass("Entered text in searchbox");
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		extent.flush();
	}
	

}
