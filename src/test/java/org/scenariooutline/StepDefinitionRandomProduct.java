package org.scenariooutline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.runner.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionRandomProduct extends Baseclass{
	@Given("user need to be in amazon page")
	public void user_need_to_be_in_amazon_page() {
		   chromeBrowser();
		   launchUrl("https://www.amazon.in/");
		   mainwindow();
	}

	@When("user should enter the product in search box")
	public void user_should_enter_the_product_in_search_box() {
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iPhone");
	}

	@When("user clicks the search button")
	public void user_clicks_the_search_button() {
	    WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    searchbtn.click();
	}

	@Then("user will navigate to the product")
	public void user_will_navigate_to_the_product() {
	    System.out.println("user is in the product page");
	    driver.quit();
	}

}
