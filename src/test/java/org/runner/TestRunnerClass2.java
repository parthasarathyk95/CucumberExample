package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Product\\facebook.feature", glue="org.facebook", dryRun= false , monochrome= true, strict=true)
public class TestRunnerClass2 {

}
