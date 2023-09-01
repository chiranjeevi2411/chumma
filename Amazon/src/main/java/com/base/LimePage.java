package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LimePage extends Baseamazo {
	
    
	public LimePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//span[text()=\"SHOP MEN\"]")
	private WebElement shopmen;

	public WebElement getShopmen() {
		return shopmen;
	}
	
	
	
	
	

}
