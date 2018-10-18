package com.qa.parameters;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\parameters\\src\\test\\java\\Parametisation.feature" , glue= {"com.qa.parameters"} )
public class Runner {

}
