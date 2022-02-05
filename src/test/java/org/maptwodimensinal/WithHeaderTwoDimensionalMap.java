package org.maptwodimensinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.runner.Baseclass;

import io.cucumber.java.en.*;


public class WithHeaderTwoDimensionalMap extends Baseclass {

	@Given("user need to be in amazon homepage")
	public void user_need_to_be_in_amazon_homepage() {
		   chromeBrowser();
		   launchUrl("https://www.amazon.in/");
		   mainwindow();
	}

	@When("user should enter product in searchbox")
	public void user_should_enter_product_in_searchbox(io.cucumber.datatable.DataTable d) {
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//List<Map<String, String>> mp = d.asMaps();
		//searchbox.sendKeys(mp.get(0).get("Product"));
		searchbox.sendKeys(d.asMaps().get(0).get("NewProduct"));
	}

	@When("user clicks the search button")
	public void user_clicks_the_search_button() {
	    WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    searchbtn.click();
	}

	@Then("user will navigate to product page")
	public void user_will_navigate_to_product_page() {
	    System.out.println("user is in the product page");
	    driver.quit();
	}
}
