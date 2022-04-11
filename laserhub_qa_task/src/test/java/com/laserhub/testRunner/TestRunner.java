package com.laserhub.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"features"}, glue= {"com.laserhub.stepdefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {
	
}


