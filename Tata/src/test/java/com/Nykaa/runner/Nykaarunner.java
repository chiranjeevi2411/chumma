package com.Nykaa.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

import com.Nykaa.base.BaseClass;
import com.Nykaa.pom.LoginPage;
import com.Nykaa.pom.ProjectObjectManager;

public class Nykaarunner extends BaseClass {
     
	
	public static void main(String[] args) throws Exception  {
		
		
		
		browserLaunch("Chrome");
		LaunchUrl("https://www.nykaa.com/");
		ProjectObjectManager pom = new ProjectObjectManager();
		pom.getLn().getMobileno_enter();
		elementClick(pom.getLn().getSignIn_btn());
		elementClick(pom.getLn().getSignInMobile_btn());
		implicit();
		elementInput(pom.getLn().getMobileno_enter(), "7708110254");
		elementClick(pom.getLn().getProceed_button());
		elementClick(pom.getLn().getOtp_Enter());
		threadsleep(35000);
		elementClick(pom.getLn().getVerfy_Button());
		
		//LoginPage lp = new LoginPage();
		//elementClick(lp.getSignIn_btn());
		//elementClick(lp.getSignInMobile_btn());
		//implicit();
		//elementInput(lp.getMobileno_enter(), "7708110254");
		//elementClick(lp.getProceed_button());
		//threadsleep(33000);
		//elementClick(lp.getVerfy_Button());
		//title();
		
	
		
		
		
		
		
	
	}

}
