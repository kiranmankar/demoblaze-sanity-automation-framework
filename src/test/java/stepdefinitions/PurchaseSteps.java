package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductPage;

public class PurchaseSteps {

    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Given("User is logged into DemoBlaze")
    public void user_is_logged_into_demoblaze() {

        DriverFactory.getDriver()
                .get("https://www.demoblaze.com");
    }

    @When("User selects a product")
    public void user_selects_a_product() {

        productPage =
                new ProductPage(
                        DriverFactory.getDriver());
    }

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {

        productPage.addProductToCart();
    }

    @When("User opens cart")
    public void user_opens_cart() {

        cartPage =
                new CartPage(
                        DriverFactory.getDriver());

        cartPage.openCart();
    }

    @Then("Product should be added successfully")
    public void product_should_be_added_successfully() {

        Assert.assertTrue(
                cartPage.isProductPresent(),
                "Product not found in cart");
    }

    @When("User clicks place order")
    public void user_clicks_place_order() {

        cartPage.clickPlaceOrder();
    }

    @When("User enters order details")
    public void user_enters_order_details() {

        checkoutPage =
                new CheckoutPage(
                        DriverFactory.getDriver());

        checkoutPage.enterOrderDetails();
    }

    @When("User clicks purchase button")
    public void user_clicks_purchase_button() {

        checkoutPage.clickPurchase();
    }

    @Then("Order should be placed successfully")
    public void order_should_be_placed_successfully() {

        Assert.assertTrue(
                checkoutPage.verifyPurchaseSuccess(),
                "Purchase failed");
    }
}