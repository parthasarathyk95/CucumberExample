// example:2 creating feature files created by gherkin keyword in features="src\\test\\resources\\Feature\\login.feature"
// just initially systemprintln of msg
package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends Baseclass{
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		mainwindow();
	}

	@When("user should enter invalid username and invalid password")
	public void user_should_enter_invalid_username_and_invalid_password() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		fillTextbox(username, "Username123");
		WebElement psswrd = driver.findElement(By.xpath("//input[@id='pass']"));
		fillTextbox(psswrd, "password123");
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() throws InterruptedException {
		System.out.println("invalid credential page");
		driver.quit();
	}

}
