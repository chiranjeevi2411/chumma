package com.Nykaa.runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.Nykaa.base.BaseClass;
import com.Nykaa.pom.ProjectObjectManager;

public class NykaaTestNGcmd extends BaseClass {
	
	
	@BeforeTest	
    
    public void browser() {
	
		browserLaunch("Chrome");
		LaunchUrl("https://www.nykaa.com/");
	}
    
     @Test
    public void Mobileno_enter() {
    	 ProjectObjectManager pom = new ProjectObjectManager();
    	implicit();
    	pom.getLn().getMobileno_enter();
		elementClick(pom.getLn().getSignIn_btn());
		elementClick(pom.getLn().getSignInMobile_btn());
		}
   @AfterTest
   public void otp_click() throws Exception {
	implicit();
	ProjectObjectManager pom = new ProjectObjectManager();
	elementInput(pom.getLn().getMobileno_enter(), "7708110254");
	
	elementClick(pom.getLn().getProceed_button());
	elementClick(pom.getLn().getOtp_Enter());
	threadsleep(35000);
	elementClick(pom.getLn().getVerfy_Button());

}
    
	
}
