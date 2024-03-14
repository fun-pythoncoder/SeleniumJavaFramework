package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
		
	}
	
	@Test(dataProvider = "testdata1")
	public void test1(String userName, String passWord) throws InterruptedException {
		System.out.println("Username: " + userName + " | Password: " + passWord);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		
		Thread.sleep(2000);
		
	}
	
	
	
	@DataProvider(name = "testdata1")
	public Object[][] getData() {
			
		Object[][] data = testData();
		return data;
				
		
	}
	
	
	public Object[][] testData(){
		
		String fileName = "/Users/meenanarayanan/Eclipse-Selenium/Excel/Data.xls";
		String sheetName = "Sheet1";
		ExcelUtils excel = new ExcelUtils(fileName, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount - 1][colCount];
		
		for(int i = 1; i < rowCount; i++) {
			for(int j = 0; j < colCount; j++) {
				data[i - 1][j] = excel.getCellDataString(i, j);
				
			}
		}
		
		return data;	
	}

}
