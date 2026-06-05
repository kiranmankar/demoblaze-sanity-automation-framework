package utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;

public class WaitUtils {
	
	public static void waitForVisibility(WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForClick(WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
