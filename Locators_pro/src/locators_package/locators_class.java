package locators_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_class {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	   String title = driver.getTitle();
	   System.out.println(title);
	   driver.navigate().to("https://www.google.in/");
	   Thread.sleep(3000);
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().forward();
		

	}

}
