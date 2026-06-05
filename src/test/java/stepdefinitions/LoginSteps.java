package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.ExcelReader;

public class LoginSteps {
	
	 HomePage homePage;
	    LoginPage loginPage;

	    String username;
	    String password;

	    @Given("User is on DemoBlaze homepage")
	    public void user_is_on_homepage() {

	        homePage = new HomePage(DriverFactory.getDriver());
	    }

	    @When("User clicks login link")
	    public void user_clicks_login_link() {

	        homePage.clickLogin();
	    }

	    @When("User enters username {string}")
	    public void user_enters_username(String user) {

	        username = user;
	    }

	    @When("User enters password {string}")
	    public void user_enters_password(String pass) {

	        password = pass;
	    }

	    @When("User clicks login button")
	    public void user_clicks_login_button() {

	        loginPage = new LoginPage(DriverFactory.getDriver());

	        String username =
	                ExcelReader.getCellData(
	                        "LoginData",
	                        1,
	                        0);

	        String password =
	                ExcelReader.getCellData(
	                        "LoginData",
	                        1,
	                        1);

	        loginPage.login(username, password);
	    }

	    @Then("User should login successfully")
	    public void user_should_login_successfully() {

	        Assert.assertTrue(
	                DriverFactory.getDriver()
	                .getPageSource()
	                .contains("Log out"));
	    }
	}
