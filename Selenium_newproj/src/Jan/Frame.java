package Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		WebElement enter = driver.findElement(By.className("frmTextBox"));
		enter.sendKeys("Chiranjeevi");
		driver.switchTo().frame("frm1");
		Thread.sleep(2000);
		Select course = new Select(driver.findElement(By.id("course")));
		course.selectByVisibleText("Java");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
        enter.clear();
        Thread.sleep(2000);
        driver.switchTo().frame("frm2");
        WebElement name = driver.findElement(By.id("firstName"));
        Thread.sleep(2000);
        name.sendKeys("jeevichiran");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("poornima");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        enter.sendKeys("priyadharshini");
        driver.switchTo().frame("frm1");
        Thread.sleep(2000);
        course.selectByVisibleText("Dot Net"); 
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("\"current URL is ====> \" +currentUrl");
        //driver.navigate().to("https://www.amazon.in/");
        //String currentUrl2 = driver.getCurrentUrl();
        //System.out.println("current URL is ====> " +currentUrl2);
        //driver.quit();
        
	}

}
  