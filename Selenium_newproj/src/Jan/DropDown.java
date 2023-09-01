package Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAI\\eclipse-workspace\\Selenium_newproj\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement coursesi = driver.findElement(By.id("course"));
		Select hi = new Select(coursesi);
        Thread.sleep(2000);
		hi.selectByIndex(1);
		Thread.sleep(2000);
		hi.selectByValue("python");
		Thread.sleep(2000);
		hi.selectByVisibleText("Dot Net");
		WebElement firstSelectedOption = hi.getFirstSelectedOption();
		System.out.println("Firts sele optn ====>"+firstSelectedOption.getText());
		

	}

}
