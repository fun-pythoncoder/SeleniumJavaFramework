package test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		GoogleSearch();

	}
	public static void GoogleSearch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		GoogleSearchPage searchpage = new GoogleSearchPage(driver);
		driver.get("https://google.com");
		searchpage.setSearchText("selenium");
		searchpage.startSearch();
		driver.quit();
		
		
	}
	
	

}
