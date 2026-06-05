package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class CheckoutPage {
	
	WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "card")
    WebElement card;

    @FindBy(id = "month")
    WebElement month;

    @FindBy(id = "year")
    WebElement year;
    
    @FindBy(xpath = "//button[text()='Purchase']")
    WebElement purchaseBtn;

    @FindBy(xpath = "//h2[contains(text(),'Thank you')]")
    WebElement thankYouMessage;

    public void enterOrderDetails() {

        WaitUtils.waitForVisibility(name);

        name.sendKeys("Kiran");
        country.sendKeys("India");
        city.sendKeys("Pune");
        card.sendKeys("123456789");
        month.sendKeys("12");
        year.sendKeys("2026");
    }
    
    public void clickPurchase() {

        WaitUtils.waitForClick(purchaseBtn);
        purchaseBtn.click();
    }

    public boolean verifyPurchaseSuccess() {

        return thankYouMessage.isDisplayed();
    }
}
