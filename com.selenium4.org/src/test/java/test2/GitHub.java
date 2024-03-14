package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitHub {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement searchBox = driver.findElement(By.name("q"));
		String attr = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(attr);
		System.out.println(searchBox.getTagName());
		System.out.println(searchBox.getText());
		System.out.println(searchBox.getCssValue("color"));

	}

}
