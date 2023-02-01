package com.e2eTests.freeCRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources",
	        
	       	tags = "@call1",
	        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
	        		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		 stepNotifications = true
	)
public class TestRunner {
	
}
