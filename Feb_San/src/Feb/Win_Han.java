package Feb;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Han {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.id("name"));
		click.sendKeys("Welcome");
		String Parent = driver.getWindowHandle();
		System.out.println("Parentwin ====>"+ Parent);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		click.clear();
		Set<String> secondndwindow = driver.getWindowHandles();
		for (String windowhandle : secondndwindow) {
			System.out.println(windowhandle);
			driver.switchTo().window(windowhandle);
			System.out.println("secondurl===>"+secondndwindow+driver.getTitle());
			driver.manage().window().maximize();
			//WebElement name = driver.findElement(By.id("firstName"));
			//name.sendKeys("Priya");
			
			
			
		}
		
		

	}

}