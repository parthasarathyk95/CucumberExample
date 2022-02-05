// example:1 creating feature files created by gherkin keyword in features="src\\test\\resources\\Feature\\login.feature"
// just initially systemprintln of msg
package org.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {


@Given("user need to be in login page")
public void user_need_to_be_in_login_page() {
System.out.println("Login Page Creation: ");	
System.out.println("fb login page");
}

@When("user should enter invalid username and invalid password")
public void user_should_enter_invalid_username_and_invalid_password() {
System.out.println("invalid username and invalid password");
}

@When("user clicks the login button")
public void user_clicks_the_login_button() {
System.out.println("login button");
}

@Then("user will navigate to invalid credential page")
public void user_will_navigate_to_invalid_credential_page() {
System.out.println("invalid credential page");
}


}
