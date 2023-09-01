package Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tamilnadutourism.tn.gov.in/");
		driver.manage().window().maximize();
		Actions tamil = new Actions(driver);
		Thread.sleep(2000);
		tamil.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"))).perform();
		Thread.sleep(2000);
		tamil.moveToElement(driver.findElement(By.xpath("(//a[@class='text-dark font-secondary font-bold p-0'])[5]"))).click().perform();
		
		
	}

}
