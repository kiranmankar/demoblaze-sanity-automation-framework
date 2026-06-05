package stepdefinitions;

import base.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignupPage;

public class SignupSteps {
	
	HomePage homePage;
    SignupPage signupPage;

    @When("User clicks signup link")
    public void user_clicks_signup_link() {

        homePage =
                new HomePage(
                        DriverFactory.getDriver());

        homePage.clickSignup();
    }

    @When("User enters signup username {string}")
    public void user_enters_signup_username(String username) {

        signupPage =
                new SignupPage(
                        DriverFactory.getDriver());

        signupPage.signup(username, "pass123");
    }

    @When("User enters signup password {string}")
    public void user_enters_signup_password(String password) {

    }

    @When("User clicks signup button")
    public void user_clicks_signup_button() {

    }

    @Then("Signup request should be submitted")
    public void signup_request_should_be_submitted() {

    }
}
