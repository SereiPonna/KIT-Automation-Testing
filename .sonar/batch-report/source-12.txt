package youtubeTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//drivers//IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();
		
		/*----------------Radio button handling---------------------------*/
		
		/*driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> list = driver.findElements(By.xpath(".//input[@name='group1']"));
		System.out.println(list.size());
		System.out.println("-------------------------------");
		
		for(WebElement e : list) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
			if(e.getAttribute("value").equals("Cheese")) {
				e.click();
			}
		}*/
		
		/*----------------Frame handling------------------------------*/
		/*
		driver.get("http://jqueryui.com/draggable/");
		
		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frame: " + frameList.size());
		
		WebElement frame = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement draggableObj = driver.findElement(By.xpath(".//*[@id='draggable']"));
		System.out.println(draggableObj.getText());
		
		driver.switchTo().defaultContent();
		WebElement title = driver.findElement(By.xpath(".//*[@id='content']/h1"));
		System.out.println(title.getText());
		*/
		
		/*----------------------Slider handling---------------------------*/
		
		driver.get("http://jqueryui.com/");
		
		
		driver.quit();
	}

}
