
package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Product\\FacebookScenarioOutline.feature", 
glue="org.scenariooutline", dryRun= false  , monochrome= true, strict=true)

public class TestRunnerScenarioOutline {

}
