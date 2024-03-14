package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement usrname = driver.findElement(By.name("username"));
		usrname.sendKeys("dfdsf");
		
		//WebElement pwd = driver.findElement(By.name("password"));
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("fdfd");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement passwordTextBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginbutton));
		passwordTextBox.sendKeys("dsfdf");
		
		
		
		
			

	}

}
