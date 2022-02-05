package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Datatable\\withoutheaderonedimensionallist.feature" ,
glue = "org.listonedimensional" , dryRun = false , monochrome = true , strict = true )
public class TestRunWithoutHeaderOneDimensionalList {

}
