package testLKPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LKPItest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://188.166.185.108/");

		/*-------Login method--------*/
		Controller handler = new Controller();
		handler.login(driver, "manager_tokyo", "1");

		/*-------Testing process-----*/
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/ul/li[3]/a")).click();

		WebElement date, selectDate, field, doneBtn;

		date = driver.findElement(By.xpath(".//*[starts-with(@id,'dp1484')]"));
		date.click();
		selectDate = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[6]/a"));
		selectDate.click();
		doneBtn = driver.findElement(By.xpath("/html/body/form/div/div/div[3]/div/button"));
		field = driver.findElement(By.xpath("html/body/form/div/div/div[3]/table[1]/tbody/tr[2]/td[3]/input"));

		//System.out.println("Inserting value into quantity [table 1]...");
		//handler.insert(driver, field, "999999999999999", 1, 3);
		
		System.out.println("Inserting value into quantity [table 2]...");
		handler.insert(driver, field, "99999", 2, 3);
		
		System.out.println("Inserting value into quantity [table 3]...");
		handler.insert(driver, field, "99999", 3, 3);
		
		System.out.println("Inserting value into sales [table 3]...");
		handler.insert(driver, field, "99999", 3, 4);
		
		doneBtn.click();

	}

}

class Controller {
	WebElement username, password, loginBtn;

	void login(WebDriver driver, String u, String p) {

		username = driver.findElement(By.id("id"));
		password = driver.findElement(By.id("password"));
		loginBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/form/div[3]/div/div/input"));

		username.sendKeys(u);
		password.sendKeys(p);
		loginBtn.click();
		System.out.println("Login success");
	}
	void insert(WebDriver driver, WebElement field, String value, int i, int k) {
		int j = 2;
		while (true) {
			try {
				field = driver.findElement(
						By.xpath("html/body/form/div/div/div[3]/table[" + i + "]/tbody/tr[" + j + "]/td[" + k +"]/input"));
				field.sendKeys(value);
				j++;
			} catch (Exception e) {
				if (j != 2)
					System.out.println("Success");
				else
					System.out.println("Fail");
				break;
			}
		}
	}
	
}
