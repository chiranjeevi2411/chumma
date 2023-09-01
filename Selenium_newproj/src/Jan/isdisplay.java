package Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		WebElement icon = driver.findElement(By.className("signin"));
		System.out.println("signin opt is Enabled --->" + "  "+icon.isEnabled());
		System.out.println("signin opt is Displayed --->"+ "  "+icon.isDisplayed());
		WebElement shopping = driver.findElement(By.xpath("//a[@class='shopicon relative']"));
		shopping.click();
		WebElement bluetooth = driver.findElement(By.xpath("//a[@xurlalt='tracking'][1]"));
		//bluetooth.click();
		System.out.println("BT optn is Enabled  --->" + "  "+ bluetooth.isSelected());
		
		

	}

}
