// example1: testrunner class with login.feature mentioned in features and org.steps mentioned in glue their package name 
package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\login.feature", glue="org.steps", dryRun= false , monochrome= true, strict=true)
public class TestRunnerClass {

}
