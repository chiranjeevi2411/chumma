package com.Nykaa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nykaa.base.BaseClass;

public class LoginPage extends BaseClass {

	

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='css-1gzc5zn']")
	private WebElement signIn_btn;

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}

	@FindBy(xpath = "(//button[@kind='secondary'])[1]")
	private WebElement signInMobile_btn;

	public WebElement getSignInMobile_btn() {
		return signInMobile_btn;
	}

	@FindBy(xpath = "//input[@class='input text-center']")
	private WebElement mobileno_enter;

	public WebElement getMobileno_enter() {
		return mobileno_enter;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Proceed_button;

	public WebElement getProceed_button() {
		return Proceed_button;
	}

	@FindBy(name = "otpValue")
	private WebElement Otp_Enter;

	public WebElement getOtp_Enter() {
		return Otp_Enter;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Verfy_Button;

	public WebElement getVerfy_Button() {
		return Verfy_Button;
	}

}
