package xpathTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='mySidenav']/a[9]")).click();
	
		driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[5]")).click();
		
		driver.quit();

	}

}
