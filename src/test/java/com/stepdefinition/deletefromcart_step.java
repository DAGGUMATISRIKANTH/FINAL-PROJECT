package com.stepdefinition;

import java.io.IOException;

import com.pages.deletefromcart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class deletefromcart_step {
	deletefromcart dc = new deletefromcart();
	@Given("^user launched Demoblaze$")
	public void user_launched_Demoblaze() 
	{
dc.demoblaze_homePage();
	}

	@When("^user selects  the product and addtocart$")
	public void user_selects_the_product_and_addtocart() 
	{
dc.Select_product();
	}

	@And("^the user clicks on Cart button$")
	public void the_user_clicks_on_Cart_button() throws IOException, InterruptedException 
	{
	dc.Add_cart();
	}

	@And("^the user remove the cart$")
	public void the_user_remove_the_cart() throws Throwable
	{
	  dc.cart();
	}


}
