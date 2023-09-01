package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LimeTshirt extends Baseamazo {

	public LimeTshirt() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='loaderCat viptshirtLdr dIb mA pA r0   h80 b4 l0 t0 ']")
	private WebElement click_Tshirt;

	public WebElement getClick_Tshirt() {
		return click_Tshirt;
	}

	@FindBy(id = "64c0f7a7adb8b829eb8c8996")
	private WebElement corpatre_Tees_click;

	public WebElement getCorpatre_Tees_click() {
		return corpatre_Tees_click;
	}

	@FindBy(id = "19976341")
	private WebElement Purple_tshirt;

	public WebElement getPurple_tshirt() {
		return Purple_tshirt;
	}
   @FindBy(id ="size_33710076")
   private WebElement size;

public WebElement getSize() {
	return size;
}

@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
 private WebElement Add_To_Cart;

public WebElement getAdd_To_Cart() {
	return Add_To_Cart;
}

   
}

