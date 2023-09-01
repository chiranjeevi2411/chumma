package com.Testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Baseamazo;
import com.base.PageObjectManager;

public class TCS002 extends Baseamazo {
PageObjectManager pom = new PageObjectManager();
	
	//LoginAmazon La = new LoginAmazon();
	@BeforeTest
	private void browse() {
		browserLaunch("Firefox");
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
       
       @AfterClass
       public void zsearchAproduct() {
       elementInput(pom.getLnp().getSearch(), "Books");
       title();
       closure();
       
    	  
	}
	
}
