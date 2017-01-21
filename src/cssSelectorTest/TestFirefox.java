package cssSelectorTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#uh-signin")).click();
		driver.findElement(By.cssSelector("#signin_info > a:nth-child(1)")).click();
		//driver.findElement(By.cssSelector("#login-username")).sendKeys("sereiponna_sok@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id^='login']")).sendKeys("test");
		
		//driver.quit();

	}

}