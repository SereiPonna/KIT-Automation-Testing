package xpathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com");
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//*[@id='mySidenav']/a[9]")).click();
//	
//		driver.findElement(By.xpath("//*[@id='leftmenuinnerinner']/a[5]")).click();
//		
//		driver.quit();
		
		

	}

}
