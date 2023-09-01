package com.step;

import com.base.Baseamazo;
import com.base.LimePage;
import com.base.LimeTshirt;
import com.base.PageObjectManager;

import io.cucumber.java.en.When;

public class Limestep extends Baseamazo {

	
	LimePage lp = new LimePage();
	//PageObjectManager pm = new PageObjectManager();
	LimeTshirt lt = new LimeTshirt();

	@When("launch the url {string}")
	public void launch_the_url(String str) {

		LaunchUrl(str);
	}

	@When("Click the shop men")
	public void click_the_shop_men() {
		lp.getShopmen().click();
		
	}

	
	@When("user click the T-shirt button")
	public void user_click_the_t_shirt_button() {
		
	 lt.getClick_Tshirt().click();
	}

	@When("user click the corporate T-shirt")
	public void user_click_the_corporate_t_shirt() {
	  lt.getCorpatre_Tees_click().click();
	
	}

	@When("user selected the purple solid polo T-shirt")
	public void user_selected_the_purple_solid_polo_t_shirt() {
	  lt.getPurple_tshirt().click();
	}

	@When("user click the required size")
	public void user_click_the_required_size() {
	  lt.getSize().click();
	}

	@When("user click the ADD to Cart button")
	public void user_click_the_add_to_cart_button() {
	    lt.getAdd_To_Cart().click();
	}
}
