package Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_ {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-link-hed'])[1]"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("(//li[@class='sub-menu-title menu-title-row pt-2 pb-2'])[1]"))).click().perform();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is =====>"+ currentUrl);
	}

}
