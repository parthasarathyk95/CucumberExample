package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Datatable\\withheaderonedimensionalmap.feature" ,
glue="org.maponedimensional" , dryRun=false , monochrome=true , strict=true)
public class TestRunWithHeaderOneDimensionalMap {

}
