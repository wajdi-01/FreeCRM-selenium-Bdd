package com.e2eTests.freeCRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources",
	        
	        tags ="@login_functionality",
	        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json",
	        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
public class TestRunner {
	
}
