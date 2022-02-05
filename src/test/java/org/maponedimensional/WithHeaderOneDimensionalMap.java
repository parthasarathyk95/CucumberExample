package org.maponedimensional;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.runner.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class WithHeaderOneDimensionalMap extends Baseclass{
	@Given("user need to be in amazon homepage")
	public void user_need_to_be_in_amazon_homepage() {
		   chromeBrowser();
		   launchUrl("https://www.amazon.in/");
		   mainwindow();
	}

	@When("user should enter product in searchbox")
	public void user_should_enter_product_in_searchbox(DataTable d) {
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Map<String, String> mp = d.asMap(String.class, String.class);
		searchbox.sendKeys(mp.get("Product")); // NewProduct change into Product
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
