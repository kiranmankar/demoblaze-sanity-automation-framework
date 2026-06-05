package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WaitUtils;

public class ProductPage {
	
	WebDriver driver;

    public ProductPage(WebDriver driver) {
  
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Samsung galaxy s6")
    WebElement product;

    @FindBy(linkText = "Add to cart")
    WebElement addToCart;

    public void addProductToCart() {

        WaitUtils.waitForClick(product);
        product.click();

        WaitUtils.waitForClick(addToCart);
        addToCart.click();
        
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert =
                wait.until(
                        ExpectedConditions.alertIsPresent());

        alert.accept();
        ;
    }
}