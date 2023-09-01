package Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Class {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		String Url = driver.getCurrentUrl();
		System.out.println("Current Url is ="+ Url);
		String Title = driver.getTitle();
		System.out.println("Title is = "+Title);
		WebElement Login = driver.findElement(By.className("signin"));
		Login.click();
		WebElement Username = driver.findElement(By.id("login1"));
		Username.sendKeys("Welcome");
		WebElement passwd = driver.findElement(By.id("password"));
		passwd.sendKeys("Chennai");
		driver.findElement(By.id("eyeicon")).click();
		driver.findElement(By.name("proceed")).click();
		String Lasturl = driver.getCurrentUrl();
	    System.out.println("Last Url is =" +Lasturl);
		driver.quit();
		}

}
