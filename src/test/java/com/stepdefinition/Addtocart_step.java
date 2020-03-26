package com.stepdefinition;

import com.pages.Addtocart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocart_step {
	Addtocart ac= new Addtocart();
	@Given("^user launched Demoblazewebsite$")
	public void user_launched_Demoblazewebsite()
	{
	ac.demoblaze_homePage();
	}

	@When("^the user selects  the product$")
	public void the_user_selects_the_product() 
	{
	    ac.Select_product();
	}

	@Then("^the user clicks on the AddtoCart button$")
	public void the_user_clicks_on_the_AddtoCart_button() throws Throwable 
	{
ac.Add_cart();
	}


}
