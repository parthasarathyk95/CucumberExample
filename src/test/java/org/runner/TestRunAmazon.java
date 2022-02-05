package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\product.feature", 
glue="org.steps", dryRun= false, monochrome= true, strict=true)

public class TestRunAmazon {

}
