package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");;
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Chiranjeevi");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().frame("frm1");
		
		
		WebElement Tcourse = driver.findElement(By.id("course"));
		Select s = new Select(Tcourse);
		s.selectByValue("net");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		
		Thread.sleep(3000);
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("PriyaDharshini");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Poornima");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		//driver.close();
		
	}

}
