package com.stepdefinition;

import com.pages.Navigatetonextpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class navigatingtonextpage_step {
	Navigatetonextpage np = new Navigatetonextpage();
	@Given("^user opens the demoblazeApplication in browser$")
	public void user_opens_the_demoblazeApplication_in_browser() 
	{
	np.url();
	}
	@When("^the user clicks on nextpage$")
	public void the_user_clicks_on_nextpage() 
	{
np.demoblaze_homePage();
	}

	@Then("^the user selects any product in the nextpage$")
	public void the_user_selects_any_product_in_the_nextpage() throws InterruptedException
 {
         np.Scrollby();
	}


}
