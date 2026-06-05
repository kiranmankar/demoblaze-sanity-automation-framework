package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class LoginPage {
	
	WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginBtn;

    public void login(String user, String pass) {

        WaitUtils.waitForVisibility(username);

        username.clear();
        username.sendKeys(user);

        password.clear();
        password.sendKeys(pass);

        loginBtn.click();
    }
}
