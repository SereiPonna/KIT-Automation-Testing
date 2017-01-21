package youtubeTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFields {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium Java");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "t");
		Thread.sleep(3000);
		//driver.quit();

	}

}
