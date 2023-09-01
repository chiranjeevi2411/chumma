package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazon extends Baseamazo {
	
	public LoginAmazon() {
    PageFactory.initElements(driver, this);
	}

	@FindBy (id = "twotabsearchtextbox")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(id ="nav-search-submit-button")
	private WebElement searchclick;

	public WebElement getSearchclick() {
		return searchclick;
	}
}
