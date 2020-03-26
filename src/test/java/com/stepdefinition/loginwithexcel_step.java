package com.stepdefinition;

import java.io.IOException;

import com.pages.loginwithexcel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginwithexcel_step {
	loginwithexcel le=new  loginwithexcel();
	@Given("^the user launched Browser$")
	public void the_user_launched_Browser()
	{
	   le.url("chrome");
	}

	@When("^the user open the Demoblaze Application in chromebrowser$")
	public void the_user_open_the_Demoblaze_Application_in_chromebrowser() 
	{
	le.demoblaze_homePage();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
	le.userclick();
	}

	@Then("^the user enters the username and password clicks on login button$")
	public void the_user_enters_the_username_and_password_clicks_on_login_button() throws IOException, InterruptedException 
 {
		for(int i=1;i<=3;i++)
		{
			le.usernamepassword(i);
			le.url("chrome");
			le.demoblaze_homePage();
			le.userclick();
		}
	
	}


}
