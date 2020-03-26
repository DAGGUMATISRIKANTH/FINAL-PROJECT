package com.stepdefinition;

import com.pages.clickingonlaptops;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class clickonlaptops_step {
	clickingonlaptops cl = new clickingonlaptops();
	@Given("^user opens the demoblazesite$")
	public void user_opens_the_demoblazesite()
	{
	cl.demoblaze_homePage();
	}

	@When("^the user clicks the Laptops under catagories$")
	public void the_user_clicks_the_Laptops_under_catagories() 
	{
	cl.laptops();
	}

	@Then("^the user select the particular Laptop$")
	public void the_user_select_the_particular_Laptop() 
	{
	cl.selectlaptop();
	}
	
	}


	

