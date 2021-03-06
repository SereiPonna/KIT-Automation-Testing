package cssSelectorTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestChrome {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#signin_info > a:nth-child(1)")).click();
		
		driver.findElement(By.cssSelector("input[id^='login']")).sendKeys("test");
		
		//driver.quit();
}
}
