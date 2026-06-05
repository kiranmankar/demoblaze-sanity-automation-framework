package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class SignupPage {
	
	WebDriver driver;

    public SignupPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sign-username")
    WebElement username;

    @FindBy(id = "sign-password")
    WebElement password;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signupBtn;

    public void signup(String user, String pass) {

        WaitUtils.waitForVisibility(username);

        username.sendKeys(user);
        password.sendKeys(pass);

        signupBtn.click();
    }
}
