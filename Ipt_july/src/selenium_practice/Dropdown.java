package selenium_practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement coursename = driver.findElement(By.id("course"));
        Select  abc = new Select(coursename);
        List<WebElement> allopt = abc.getOptions();
        for (WebElement Total : allopt) {
			System.out.println("Coursename===>"+"  "+Total.getText());
		}
         abc.selectByValue("js");         
         
        WebElement IDEName = driver.findElement(By.id("ide"));
        Select def = new Select(IDEName);
        
        def.selectByIndex(0);
        def.selectByVisibleText("NetBeans");
        
}
}