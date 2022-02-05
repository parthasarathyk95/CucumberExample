// Scenario outline with Examples
package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.runner.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookScenarioOutline extends Baseclass{
	

@Given("user need to be in login page")
public void user_need_to_be_in_login_page() {
	chromeBrowser();
	launchUrl("https://www.facebook.com/");
	mainwindow();
}

@When("user should enter invalid {string} and {string}")
public void user_should_enter_invalid_and(String user,  String pass) {
	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	fillTextbox(username, user);
	System.out.print("username : ");
	System.out.println(user);
	WebElement psswrd = driver.findElement(By.xpath("//input[@id='pass']"));
	fillTextbox(psswrd, pass);
	System.out.print("password : ");
	System.out.println(pass);
}

@When("user clicks the login button")
public void user_clicks_the_login_button() {
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
}

@Then("user will navigate to invalid credential page")
public void user_will_navigate_to_invalid_credential_page() {
	System.out.println("invalid credential page");
	driver.quit();
}
}
