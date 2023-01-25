package com.e2eTests.freeCRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/specs/features" ,  tags = "@precingLink" , 
plugin = {"pretty" , "html:target/reports/report.html"})




public class TestRunner {

}
