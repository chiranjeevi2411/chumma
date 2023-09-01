package com.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Baseamazo;
import com.base.LoginAmazon;
import com.base.PageObjectManager;


public class TCS001 extends  Baseamazo {

	PageObjectManager pom = new PageObjectManager();
	
	//LoginAmazon La = new LoginAmazon();
	
	
	@BeforeTest
	private void browse() {
		browserLaunch("Chrome");
}
	
       @BeforeClass
	   private void urlpass() throws Exception {
		LaunchUrl("https://www.amazon.in");
		threadsleep(6000);
		}
       
       @Test
       private void ValidateTheHomePage() {
        String expected = "Amazon.in";
        String actual = driver.getTitle();
    	SoftAssert soft = new SoftAssert();
    	soft.assertEquals(actual, expected);
	}
       
       @AfterTest
       public void zsearchAproduct() {
       elementInput(pom.getLnp().getSearch(), "Books");
       title();
       closure();
       
    	  
	}

       
}
