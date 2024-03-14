package test2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		//List<WebElement> availableoptions = driver.findElements(By.id("option"));
		
        WebElement dropdown = driver.findElement(By.id("option"));
		Select selectobj = new Select(dropdown);
		List<WebElement> availableoption = selectobj.getOptions();
		for(WebElement options : availableoption) {
			System.out.println(options.getText());
			if(options.getText().equalsIgnoreCase("Option 2")) {
				options.click();
				System.out.println("done");
			}
			    
		}
				
		
		
		
	}
}


