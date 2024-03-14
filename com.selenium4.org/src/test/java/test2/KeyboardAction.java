package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		/*
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium" + Keys.ENTER);
		Actions actionprovider = new Actions(driver);
		Action keydown = actionprovider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		Thread.sleep(2000);
		driver.quit();
		
		
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		
		
		
		
		/*
		driver.get("https://google.com");
		searchbox.sendKeys("selenium");
		actionprovider.keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys("selenium");
		Thread.sleep(2000);
		searchbox.clear();
		*/
		
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("dsfdfdf");
		Actions actionProvider = new Actions(driver);
		actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		System.out.println("fdfdgFD");
		Thread.sleep(2000);
		driver.quit();
		

		

	}

}
