package com.step;

import org.openqa.selenium.By;

import com.base.Baseamazo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def extends Baseamazo {
	
	

	@Given("user can able to lainch the amazon home page")
	public void user_can_able_to_lainch_the_amazon_home_page() {
	   title();
	}

	@When("user can pass the data in input field")
	public void user_can_pass_the_data_in_input_field() {
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
     
	}
	@When("user can select a random product in present page")
	public void user_can_select_a_random_product_in_present_page() {
	  
	}
	@Then("user can get a title and validate")
	public void user_can_get_a_title_and_validate() {
	   
	}

	
}
