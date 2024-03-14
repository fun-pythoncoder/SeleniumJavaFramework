package test3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearchTest_TestNG2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void GoogleSearch2() {
	
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Java" + Keys.ENTER);
				
		
	}
	
	@Test
	public void GoogleSearch3() {
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Python" + Keys.ENTER);
				
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
	
	

}
