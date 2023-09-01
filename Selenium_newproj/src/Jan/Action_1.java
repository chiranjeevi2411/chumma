package Jan;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions Act = new Actions(driver);
		Act.moveToElement(driver.findElement(By.xpath("(//span[@class='catText'])[1]"))).perform();
		Act.moveToElement(driver.findElement(By.xpath("(//span[@class='linkTest'])[5]"))).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']")).sendKeys("600070");
		 Thread.sleep(3000);
		Act.doubleClick(driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"))).perform();
		Thread.sleep(3000);
		 WebElement button =
		driver.findElement(By.xpath("//button[@class='pincode-check']"));
		 button.click();
	}

}
