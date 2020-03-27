package com.runners;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/Testcase.feature",
		
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
tags= {"@tc01_demoblazeloginwithvaliddetails,@tc02_ClickingonLaptops,@tc03_Navigatetonextpage,@tc04_Addtocart,@tc05_deletefromcart"},
monochrome=true,
glue= {"Com.Stepdefinition"}
		 )
public class CopyOfTestRunner {
	@AfterClass
	public static void writeExtentReport() {
	    Reporter.loadXMLConfig("src\\main\\resources\\extent-config.xml");
	}
}
