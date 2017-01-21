package xpathTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//drivers//IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.w3schools.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='mySidenav']/a[9]")).click();
	
		driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[5]")).click();
		
		driver.quit();

	}

}
