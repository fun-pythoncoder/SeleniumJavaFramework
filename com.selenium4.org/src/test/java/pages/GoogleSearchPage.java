package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver = null;
	By searchtext = By.id("APjFqb");
	By searchbttn = By.name("btnK");
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void setSearchText(String text) {
		driver.findElement(searchtext).sendKeys(text);
	}
	
	public void startSearch() {
		driver.findElement(searchbttn).sendKeys(Keys.ENTER);
	}
	

}
