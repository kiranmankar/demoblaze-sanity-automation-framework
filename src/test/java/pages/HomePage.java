package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class HomePage {
	
	WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(id = "signin2")
    WebElement signupLink;

    public void clickLogin() {

        WaitUtils.waitForClick(loginLink);
        loginLink.click();
    }

    public void clickSignup() {

        WaitUtils.waitForClick(signupLink);
        signupLink.click();
    }
}
