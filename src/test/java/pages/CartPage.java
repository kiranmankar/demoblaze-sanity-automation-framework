package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class CartPage {
	
	WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cartur")
    WebElement cartLink;

    @FindBy(xpath = "//tr[@class='success']")
    WebElement cartRow;
    
    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderBtn;

    public void openCart() {

        WaitUtils.waitForClick(cartLink);
        cartLink.click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isProductPresent() {

        return cartRow.isDisplayed();
    }
    
    public void clickPlaceOrder() {

        WaitUtils.waitForClick(placeOrderBtn);
        placeOrderBtn.click();
    }
}
