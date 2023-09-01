package Feb;



	import java.io.File;
	import java.io.IOException;
	import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class pet {
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Feb_San\\Library\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/index.php");
			driver.manage().window().maximize();
		    WebElement user = driver.findElement(By.name("username"));
		    user.sendKeys("Petchimuthu");
		    WebElement pwrd = driver.findElement(By.name("password"));
		    pwrd.sendKeys("Petchi@0075");
		    WebElement login = driver.findElement(By.name("login"));
		    login.click();
		    WebElement loc = driver.findElement(By.xpath("//select [@class = 'search_combobox']"));
		    Select s1=new Select(loc);
		    s1.selectByValue("London");
		    WebElement hotel = driver.findElement(By.id("hotels"));
		    Select s2=new Select(hotel);
		    s2.selectByVisibleText("Hotel Cornice");
		    WebElement roomtype = driver.findElement(By.name("room_type"));
		    Select s3=new Select(roomtype);
		    s3.selectByIndex(4);
		    WebElement roomnos = driver.findElement(By.xpath("//select [contains(@name,'room_nos')]"));
		    Select s4=new Select(roomnos);
		    s4.selectByValue("3");
		    WebElement checkin = driver.findElement(By.xpath("//input [contains(@id,'datepick_in')]"));
		    checkin.sendKeys("19/02/2023");
		    WebElement checkout = driver.findElement(By.xpath("//input [contains(@name,'datepick_out')]"));
		    checkout.sendKeys("20/02/2023");
		    WebElement adult = driver.findElement(By.xpath("//select [contains(@name,'adult_room')]"));
		    Select s5=new Select(adult);
		    s5.selectByValue("2");
		    WebElement children = driver.findElement(By.xpath("//select [@name = 'child_room']"));
		    Select s6=new Select(children);
		    s6.selectByIndex(2);
		    WebElement search = driver.findElement(By.xpath("//input [@name = 'Submit']"));
		    search.click();
		    
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    File destination = new File("D:\\eclipse java\\Java_Selenium\\ScreensShot\\project1.png");
		    FileUtils.copyFile(source, destination);
		    
		    WebElement sele = driver.findElement(By.xpath("//input [@type = 'radio']"));
		    sele.click();
		    
		    WebElement cont = driver.findElement(By.xpath("//input [@class = 'reg_button']"));
		    cont.click();
		    WebElement first = driver.findElement(By.id("first_name"));
		    first.sendKeys("Tamilarasan");
		    
		    WebElement last = driver.findElement(By.xpath("//input [@name = 'last_name']"));
		    last.sendKeys("P");
		    
		    WebElement bill = driver.findElement(By.xpath("//textarea [@class = 'txtarea']"));
		    bill.sendKeys("No.2,Alamathi,Redhills,chennai-52");
		    
		    WebElement cc = driver.findElement(By.id("cc_num"));
		    cc.sendKeys("5542378521456457");
		    WebElement cctype = driver.findElement(By.xpath("//select [@class = 'select_combobox']"));
		    Select s8 = new Select(cctype);
		    s8.selectByValue("MAST");
		    WebElement expiry = driver.findElement(By.xpath("//select [@name = 'cc_exp_month']"));
		    Select s9=new Select(expiry);
		    s9.selectByValue("6");
		    WebElement year = driver.findElement(By.xpath("//select [@name = 'cc_exp_year']"));
		    Select s10=new Select(year);
		    s10.selectByIndex(12);
		   try {
			   WebElement cvv = driver.findElement(By.name(""));
			    cvv.sendKeys("321");
		   }
		   catch(Exception ec) {
			   
			   System.out.println("no codes");
		   }
		    
		    WebElement booknow = driver.findElement(By.xpath("//input [@onclick = 'book_hotel_validate();']"));
		    booknow.click();
		    
		    Thread.sleep(5000);
		   
		    WebElement myitinerary = driver.findElement(By.xpath("//input [@value ='']"));
		    myitinerary.click();
		  
		   //catch (Exception nse) {
			   //System.out.println("paravailla");
		   //}
		    //Thread.sleep(5000);
		    
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("current url is ====>"+currentUrl);
		    //WebElement logout = driver.findElement(By.xpath("//input [@onclick = 'window.location=\"Logout.php\"']"));
		    //logout.click();
		    driver.quit();
		    //TakesScreenshot sh=(TakesScreenshot)driver;
		    //File source1 = sh.getScreenshotAs(OutputType.FILE);
		    //File destination1 = new File("D:\\eclipse java\\Java_Selenium\\ScreensShot\\project3.png");
		    //FileUtils.copyFile(source1, destination1);
		    
			}
			
		}

