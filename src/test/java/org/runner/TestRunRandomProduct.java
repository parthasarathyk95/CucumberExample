package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Product\\randomproduct.feature" ,
glue="org.scenariooutline" , dryRun=false , monochrome=true , strict=true)
public class TestRunRandomProduct {

}
