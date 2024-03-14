package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//WebElement boxA =driver.findElement(By.xpath("//li[@class = 'ui-state-default'][@name = 'A']"));
		//WebElement boxD =driver.findElement(By.xpath("//li[@class = 'ui-state-default'][@name = 'D']"));
		
		WebElement boxA =driver.findElement(By.xpath("//li[text() = 'A']"));
		WebElement boxD =driver.findElement(By.xpath("//li[text() = 'D']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxD);
		actions.release().perform();
		Thread.sleep(2000);
		System.out.println("done");
		

	}

}
